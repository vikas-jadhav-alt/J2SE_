//TSwithSBObjects.java 
import java.util.*;

class TSwithSBObjects {
	public static void main(String[] args) {
	
		TreeSet ts1 = new TreeSet();
	//	ts1.add( new StringBuffer("a") );
	//	ts1.add( new StringBuffer("c") );
	//	ts1.add( new StringBuffer("b") );

		TreeSet ts2 = new TreeSet( 
			new SBAscendingComparator());
		ts2.add( new StringBuffer("a") );
		ts2.add( new StringBuffer("c") );
		ts2.add( new StringBuffer("b") );
		System.out.println("ts2 elements: "+ts2);
		
		TreeSet ts3 = new TreeSet( 
			new SBDescendingComparator());
		ts3.add( new StringBuffer("a") );
		ts3.add( new StringBuffer("c") );
		ts3.add( new StringBuffer("b") );
		System.out.println("ts3 elements: "+ts3);

	}
}