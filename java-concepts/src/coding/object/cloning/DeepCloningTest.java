package coding.object.cloning;

import java.util.HashMap;
import java.util.Map;

public class DeepCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		DeepCopyEmployee emp = new DeepCopyEmployee();
		emp.setId(1);
		emp.setName("ABC");
		emp.setProps(props);

		DeepCopyEmployee clonedEmp = (DeepCopyEmployee) emp.clone();

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
// other way of deep cloning is :
//	1. One way to easily perform deep cloning is through serialization. But serialization is an expensive procedure and your class should implement Serializable interface. All the fields and superclasses must implement Serializable too.
//	2. If you are already using Apache Commons Util classes in your project and your class is serializable, then use the below method.
//	3. We can define a copy constructor to create a copy of the object
}