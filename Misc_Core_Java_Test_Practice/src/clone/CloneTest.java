package clone;

import java.util.ArrayList;
import java.util.List;

class Person implements Cloneable {

	String fn; // immutable
	String ln; // immutable
	List<String> colors; // mutable

	public Person() {
		super();
		System.out.println("...Constructor Called: No Arg");
	}

	public Person(String fn, String ln, List<String> colors) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.colors = colors;
		System.out.println("...Constructor Called: With Arg");
	}

	/** SHALLOW CLONNING */
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	/** DEEP CLONNING */
	// For Deep Clonning There Are Multiple ways and libraries available:

	// Note that the super.clone() call returns a shallow copy of an object, but we
	// set deep copies of mutable fields manually, so the result is correct:
	@Override
	protected Object clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			person = new Person(this.fn, this.ln, this.colors);
		}

		// Creating Total new copy of Mutable Objects
		person.colors = new ArrayList<>(this.colors);
		return person;
	}

	@Override
	public String toString() {
		return "Person [fn=" + fn + ", ln=" + ln + ", colors=" + colors + "]";
	}

}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Test Start\n");

		List<String> colorsLiked = new ArrayList<>();
		colorsLiked.add("White");
		colorsLiked.add("Black");

		Person p1 = new Person("Akshay", "Kumar", colorsLiked);
		Person p2 = p1;

//		NOTE: JAVA is only PASS BY VALUE

		// both p1 and p2 pointing to same object, (see result of == operrator)
		System.out.println(p1 == p2); // true
		System.out.println(p1.hashCode() + " " + p2.hashCode()); // 1651191114 1651191114

		/** Shallow Clone */ // Refer clone() : for Shallow Cloning
		System.out.println("*********SHALLOW CLONNING************");
		Person p3 = (Person) p1.clone();

		// NOTE: In Cloning we create totally separate NEW object (irrespective of
		// Shallow
		// or Deep cloning)
		// but in case of Shallow cloning we copy the references of fields as it is
		// instead of their value/data
		// or instead of creating new or assigning new memory for the fields variables.

		// P3 pointing to some other object not what pointed by P1 ref.
		// But both having same content due to Shallow Clonning.

		System.out.println(p1 == p3); // false
		System.out.println(p1.hashCode() + " " + p3.hashCode());// 1651191114 1586600255

		System.out.println(p1); // Person [fn=Akshay, ln=Kumar, colors=[White, Black]]
		System.out.println(p3); // Person [fn=Akshay, ln=Kumar, colors=[White, Black]]

		System.out.println("---Impact of Shallow Cloning");
		// impact of shallow clonning: modification at one location, reflects other
		p3.colors.add("Pink");

		System.out.println(p1); // Person [fn=Akshay, ln=Kumar, colors=[White, Black, Pink]]
		System.out.println(p3); // Person [fn=Akshay, ln=Kumar, colors=[White, Black, Pink]]

		/** Deep Clone */ // Refer clone() : for DEEP Cloning
		System.out.println("*********DEEP CLONNING************");
		System.out.println(p1); // Person [fn=Akshay, ln=Kumar, colors=[White, Black]]
		System.out.println(p3); // Person [fn=Akshay, ln=Kumar, colors=[White, Black, Pink]]

		System.out.println("\nTest End");

	}

}
