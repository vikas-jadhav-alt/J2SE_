//IteratorMethodsRulesDemo.java
import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorMethodsRulesDemo {
	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		
		Iterator itr = lhs.iterator();

		//itr.remove();  //RE: java.lang.IllegalStateException

		Object o1 = itr.next();
		System.out.println(o1);//a

		itr.remove(); //a is removed

		//lhs.add("d");  // this statement causes CME when next() is called 

		Object o2 = itr.next(); // RE: java.util.ConcurrentModificationException
		System.out.println(o2);//b

		Object o3 = itr.next();
		System.out.println(o3);//c

		//Object o4 = itr.next(); //RE: java.util.NoSuchElementException

		itr.remove();//c is removed

		lhs.add("d"); //it is correct and d is added

		System.out.println(lhs);//[b, d]
	}
}
