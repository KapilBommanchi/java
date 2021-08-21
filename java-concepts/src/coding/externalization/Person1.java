package coding.externalization;

public class Person1 {
	String name = "default";
	String nationality;

	public Person1() {
		System.out.println("Person:Constructor");
	}

	public Person1(String name, String nationality) {
		super();
		this.name = name;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
