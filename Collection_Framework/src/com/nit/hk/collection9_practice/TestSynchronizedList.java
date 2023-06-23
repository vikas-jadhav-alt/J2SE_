import java.util.*;
class  TestSynchronizedList
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al = 
				new ArrayList<Student>();
			
		List<Student> list = 
			Collections.synchronizedList( al );

		
		System.out.println(list.getClass().getName());

		List list2 = Collections.unmodifiableList(al);
		list2.add(30);
	}
}
