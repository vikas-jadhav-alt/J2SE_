package oops.inheritance;

//interface Animal {

//
//	void m(int l);
//	void m(long l);
//	
//
//}
//
//class Dog implements Animal {
//
//	public void m(long i) {
//		System.out.println("Dog: Long");
//	}
//
//	public void m(int i) {
//		System.out.println("Dog: Int");
//	}
//
//}
//
//class TestZ {
//	public static void main(String[] args) {
//		Animal a = new Dog();
//		a.m(5); // a(int) //Dog: Long
//	}
//}

interface XYZ extends CharSequence {

}

interface ABC {
}

class OverLoad {

	void m(Object o) {
		System.out.println("Object Case");
	}

	void m(XYZ o) {
		System.out.println("XYZ Case");
	}

	void m(ABC o) {
		System.out.println("ABC Case");
	}

	void m(CharSequence o) {
		System.out.println("CharSequence Case");
	}

	public static void main(String[] args) {
		OverLoad obj = new OverLoad();
		obj.m(null); // CTE: Ambiguity Error

		obj.m(""); // CharSequence Case //String implements CharSequence

		CharSequence s = new String("YUY");
		obj.m(s); // CharSequence Case

		obj.m(new Object()); // Object Case
	}
}
