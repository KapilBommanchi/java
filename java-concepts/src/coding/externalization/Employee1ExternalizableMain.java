package coding.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee1ExternalizableMain {
	public static void main(String[] args) {

		// Serialize
		Employee1 emp = new Employee1(101, "Arpit", "CS", "Indian");
		System.out.println("Before serializing");
		System.out.println("Emp id: " + emp.getEmployeeId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Department: " + emp.getDepartment());
		System.out.println("Nationality: " + emp.getNationality());
		System.out.println("************");
		System.out.println("Serializing");
		try {
			FileOutputStream fileOut = new FileOutputStream("employeeExt1.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// Deserialize
		System.out.println("************");
		System.out.println("Deserializing");
		emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("employeeExt1.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee1) in.readObject();
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
		System.out.println("After serializing");
		System.out.println("Emp id: " + emp.getEmployeeId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Department: " + emp.getDepartment());
		System.out.println("Nationality: " + emp.getNationality());
	}
}
