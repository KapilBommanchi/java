package coding.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -2464227920999142972L;

	private int employeeId;
	private String employeeName;
	private String department;

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
}