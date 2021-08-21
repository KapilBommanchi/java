package coding.object.cloning;

import java.util.Map;

/**
 * We are using Object clone() method, so we have implemented the Cloneable
 * interface
 *
 *
 */
public class ShallowCopyEmployee implements Cloneable {
	private int id;

	private String name;

	private Map<String, String> props;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
