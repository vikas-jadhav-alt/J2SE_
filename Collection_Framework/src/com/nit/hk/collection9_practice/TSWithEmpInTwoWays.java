//TSWithLambda.java
import java.util.*;

class TSWithLambda{
	public static void main(String[] args){

		TreeSet ts1 = new TreeSet();
		addAndPrint(ts1);
		System.out.println();

		TreeSet ts2 = new TreeSet( 
			new  Comparator<Employee>(){
					public int compare(Employee e1 , Employee e2){
						return e1.dept.compareTo(e2.dept);	
					}
			}
		);
		addAndPrint(ts2);
		System.out.println();

		TreeSet ts3 = new TreeSet(
			new 	Comparator<Employee>(){
				public int compare(Employee e1, Employee e2){
					return e1.eid - e2.eid;
				}		
			}		
		);
		addAndPrint(ts3);
		
		System.out.println();

		TreeSet ts4 = new TreeSet(
			(Object o1, Object o2) -> {
				Employee e1 = (Employee)o1;
				Employee e2 = (Employee)o2;
				return e1.exp - e2.exp;
			}
		);
		addAndPrint(ts4);

	}
	static void addAndPrint(TreeSet ts){
		
		ts.add( new Employee(101, "Hari", "CoreJava", 1) );
		ts.add( new Employee(101, "Hari", "CoreJava", 2) );
		ts.add( new Employee(55, "Hari", "XML", 5) );
		ts.add( new Employee(103, "Hari", "AdvJava", 2) );
		ts.add( new Employee(104, "Hari", "EJB", 9) );
		ts.add( new Employee(105, "BB", "Acting",20)  );
		ts.add( new Employee(106, "Hari", "DotNet",  0));
		ts.add( new Employee(107, "MB", "Acting", 25) );
		System.out.println(ts);
	}
}
