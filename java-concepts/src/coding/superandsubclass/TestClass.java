package coding.superandsubclass;

public class TestClass {
	void classTest() {
		SuperClass ref = new SubClass();
		System.out.println(ref.word);// output 1 ?????
		ref.printWord();// output 2 ?????

	}

	public static void main(String[] args) {
		TestClass st = new TestClass();
		st.classTest();
	}

}