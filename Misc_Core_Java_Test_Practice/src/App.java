
class Test {

	static {
		System.out.println("---------Test Static Block");
	}

	public Test() {

		System.out.println("Test Constructor");
	}

}

class Study {

	static {
		System.out.println("--------Study Static Block");
	}

	public Study() {

		System.out.println("Study Constructor");
	}

}

public class App {

	static {
		System.out.println("----------APP Static Block");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("Main : Start");

		Study s1 = new Study();
		Study s2 = new Study();
		Study s3 = new Study();
		
		
		Class.forName("Test");
		Class.forName("Test");
		Class.forName("Test");

		System.out.println("Main : End");
		
		Class.forName("Testxyz");

		System.out.println("Main : Final");
		
		
	}

}