package coding.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(4, "John", 20);
		Employee e2 = new Employee(3, "Martin", 40);
		Employee e3 = new Employee(1, "Mary", 28);
		Employee e4 = new Employee(2, "Andrew", 35);

		List<Employee> listofEmployees = new ArrayList<>();
		listofEmployees.add(e1);
		listofEmployees.add(e2);
		listofEmployees.add(e3);
		listofEmployees.add(e4);

		System.out.println("Before Sorting by empId: ");
		for (Employee e : listofEmployees) {
			System.out.println("Employee Id: " + e.getEmpId() + "|| name: " + e.getName());
		}

		// Collections.sort(listofEmployees, new EmployeeSortByIdComparator());
		// System.out.println("After Sorting by empId: ");
		// for (Employee e : listofEmployees) {
		// System.out.println("Employee Id: " + e.getEmpId() + "|| name: " +
		// e.getName());
		// }

		// anonymous comparator
		Collections.sort(listofEmployees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("After Sorting by name: ");
		for (Employee e : listofEmployees) {
			System.out.println("Employee Id: " + e.getEmpId() + "|| name: " + e.getName());
		}
	}
}
