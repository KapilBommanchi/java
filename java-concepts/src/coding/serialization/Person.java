package coding.serialization;

public class Person {
	private String name = "default";
	private String nationality;

	public Person() {
		System.out.println("Person:Constructor");
	}

	public Person(String name, String nationality) {
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
