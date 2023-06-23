import java.util.*;
class ArrayToList {
	public static void main(String[] args) {
		String[] sa = {"a", "b", "c"};
		System.out.println(sa);
		System.out.println(Arrays.toString(sa));
		
		List<String> list = Arrays.asList(sa);
		
		System.out.println("list: "+list);
		System.out.println("3rd element: "+list.get(2));
		
		//list.add("d"); RE: USOE
		//On asList() method returend list we cannot call add method, because it is only return for view purpose

		//To add more objects after a, b, c elements, we must create new collection with this List object elements

		ArrayList<String> al = 
				new ArrayList<String>( list);
		
		System.out.println("al elements: "+al);

		al.add("d");
		System.out.println("al elements: "+al);
		System.out.println("list elements: "+list);

	}
}
