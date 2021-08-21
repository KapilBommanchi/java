package coding.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee2 implements Serializable {
	private static final long serialVersionUID = 4747958254006725156L;
	private int employeeId;
	private String employeeName;
	private String department;
	private transient Address2 address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	// ** For Deserialization Address2 will throw NPE (since Address2 is transient,
	// so it'll not serialize.)
	// if we do not implement below two methods

	private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException {
		try {
			os.defaultWriteObject();
			os.writeInt(address.getHomeNo());
			os.writeObject(address.getStreet());
			os.writeObject(address.getCity());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
		try {
			is.defaultReadObject();
			int homeNo = is.readInt();
			String street = (String) is.readObject();
			String city = (String) is.readObject();
			address = new Address2(homeNo, street, city);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
