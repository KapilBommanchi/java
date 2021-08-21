package coding.serialization;

import java.io.Serializable;

public class Employee3 extends Person implements Serializable {
	private static final long serialVersionUID = -8687689873218502937L;
	private int employeeId;
	private String department;

	public Employee3(int employeeId, String name, String department, String nationality) {
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
}
