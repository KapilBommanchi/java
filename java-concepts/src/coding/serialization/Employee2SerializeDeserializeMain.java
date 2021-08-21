package coding.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee2SerializeDeserializeMain {
	public static void main(String[] args) {
		Employee2 emp = new Employee2();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Arpit");
		emp.setDepartment("CS");
		Address2 address = new Address2(88, "MG road", "Pune");
		emp.setAddress(address);

		// Serialize
		try {
			FileOutputStream fileOut = new FileOutputStream("employee2.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// Deserialize
		emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee2.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee2) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Emp id: " + emp.getEmployeeId());
		System.out.println("Name: " + emp.getEmployeeName());
		System.out.println("Department: " + emp.getDepartment());
		address = emp.getAddress();
		System.out.println("City :" + address.getCity());
	}
}
