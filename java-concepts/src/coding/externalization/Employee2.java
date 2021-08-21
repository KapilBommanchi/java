package coding.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee2 extends Person2 implements Externalizable {
	int employeeId;
	String department;

	public Employee2() {
		System.out.println("From Default consturctor of Employee2 class");
	}

	public Employee2(int employeeId, String name, String department, String nationality) {
		super(name, nationality);
		this.employeeId = employeeId;
		this.department = department;
		System.out.println("Employee:Constructor");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		super.writeExternal(out);
		out.writeInt(employeeId);
		out.writeObject(department);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		super.readExternal(in);
		employeeId = in.readInt();
		department = (String) in.readObject();

	}
}
