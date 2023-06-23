import java.util.*;

class ListRemoveTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println("al elements: "+al);
		
		al.remove("c");
		System.out.println("al elements: "+al);

		al.remove(new String("b"));
		System.out.println("al elements: "+al);

		al.remove(new String("A"));
		System.out.println("al elements: "+al);

		System.out.println("\n==============\n");
		
		//Working with Student object(custom class)
		ArrayList nit = new ArrayList();
		
		Student s1 = new Student(1, "Jr. NTR", "7 AM");
		Student s2 = new Student(2, "BB", "7 AM");
		Student s3 = new Student(3, "HK", "7 AM");
		
		nit.add(s1);
		nit.add(s2);
		nit.add(s3);
		
		System.out.println("NIT Students");
		System.out.println(nit);

		nit.remove(s1);
		System.out.println(nit);

		nit.remove( new Student( 2, "BB", "7 AM") );
		System.out.println(nit);

	}
}

