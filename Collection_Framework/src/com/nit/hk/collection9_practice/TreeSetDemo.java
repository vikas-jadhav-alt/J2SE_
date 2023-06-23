import java.util.*;

class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet ts1 = new TreeSet();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println("ts1: "+ts1);
	
		TreeSet ts2 = new TreeSet();
		ts2.add(10);
		ts2.add(5);
		ts2.add(12);
		System.out.println("ts2: "+ts2);

		TreeSet ts3 = new TreeSet();
		ts3.add( new Student(1, "st1", 7));
		ts3.add( new Student(1, "st1", 2));
		ts3.add( new Student(3, "st3", 7));
		ts3.add( new Student(2, "st2", 9));
		ts3.add( new Student(2, "st2", 7));
		ts3.add( new Student(4, "st2", 2));
		ts3.add( new Student(4, "st3", 2));
		System.out.println("ts3: \n"+ts3);

	}
}
