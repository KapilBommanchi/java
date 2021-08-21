package coding.object.cloning;

import java.util.HashMap;
import java.util.Map;

public class ShallowCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		ShallowCopyEmployee emp = new ShallowCopyEmployee();
		emp.setId(1);
		emp.setName("ABC");
		emp.setProps(props);

		ShallowCopyEmployee clonedEmp = (ShallowCopyEmployee) emp.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));

		System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));

		// Let's see the effect of using default cloning

		// change emp props
		emp.getProps().put("title", "CEO");
		emp.getProps().put("city", "New York");
		System.out.println("clonedEmp props:" + clonedEmp.getProps());

		// change emp name
		emp.setName("new");
		System.out.println("clonedEmp name:" + clonedEmp.getName());

		// change emp id
		emp.setId(2);
		System.out.println("clonedEmp name:" + clonedEmp.getId());

	}
}