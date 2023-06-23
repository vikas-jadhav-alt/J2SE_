package com.nit.hk.suncollections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test02_ArrayList {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		ArrayList<Object> al1 = new ArrayList<>();

		//System.out.println(al1.capacity());
		
//Operation #1: Finding capacity of ArrayList
		//Reflection API code for accessing private members
		Class<?> clazz = al1.getClass();
		Field field = clazz.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[])field.get(al1);
		System.out.println(elementData.length);

//Operation #2: Finding size, counting number of objects in ArrayList		
		System.out.println(al1.size());
		
//Operation #3: Displaying elements available in ArrayList  		
		System.out.println(al1);
		System.out.println();

//Operation #4: Adding elements to ArrayList 		
		al1.add("a");
		al1.add("b");
		al1.add(5);
		al1.add(6.7);
		al1.add('p');
		al1.add(true);
		al1.add("a");
		al1.add(5);
		al1.add(null);
		al1.add(new A(5, 6));
		al1.add(null);
		al1.add(null);
		al1.add(new A(7, 8));
		al1.add(new A(5, 6));
		
		elementData = (Object[])field.get(al1);
		System.out.println(elementData.length);
		System.out.println(al1.size());
		System.out.println(al1);
				
//Operation #5: Retrieving elements from ArrayList
		System.out.println(al1.get(0));
		System.out.println(al1.get(5));
		//System.out.println(al1.get(-1));	//Rule #1: index >=0 && index<size()
		//System.out.println(al1.get(14));	//Rule #1: index >=0 && index<size()
		//System.out.println(al1.get(15));	//Rule #1: index >=0 && index<size()
		
		//String s1 = al1.get(1);			//Rule #2: we can not assign element 
											//to a variable of returning object type. 
											//Ex: String, because 
											//element is returned as Object type
											//we must assign it Object type variable
											//later we must type cast to return object
											//type
		Object obj;
		obj = al1.get(1); 		
		//System.out.println(obj.toUpperCase()); //Rule #3: can not invoke return object 
											//specific methods by using Object type ref			
		
		//String s1 = (String)obj;			//Rule #4: we must not type cast directly
											//we may get CCE, because collection is
											//heterogeneous
		
		//if(obj instanceof String) {		//Old style			
		//	String s1 = (String)obj;
		
		if(obj instanceof String s1) {		//Java 14 style	
			System.out.println(s1.toUpperCase());
		}
		System.out.println();
		
		//retrieving all elements from arraylist
		for(int i=0; i<al1.size(); i++) {	//Rule #4: condition operation must be <
			System.out.println(al1.get(i));	//but not <=. If <= is used there must be
		}									//al1.size()-1
		
		System.out.println();
		//for(int i=0; i<=al1.size(); i++) {	//O/P:ele1 .... end ele + RE: IOOBE
		//for(int i=0; i<=al1.size()-1; i++) {	//O/P:ele1 .... end ele 
		for(int i=0; i<al1.size()-1; i++) {		//O/P:ele1 .... end-1 ele 
			System.out.println(al1.get(i));			
		}
		
		System.out.println();
		for(int i=0; i<al1.size(); i++) {		//O/P: only a is display  
			System.out.println(al1.get(0));		//for al1.size() times	
		}
		System.out.println();

//Operation #6: searching an object -> implicitly equals() method and == operator are used
		//just knowing available or not
		System.out.println(al1.contains("a"));
		System.out.println(al1.contains("A"));
		System.out.println(al1.contains(5));
		System.out.println(al1.contains(null));
		System.out.println(al1.contains(new A(7, 8)));
		System.out.println();
		
		//knowing in which index this element is available
		System.out.println(al1);
		System.out.println(al1.indexOf("a"));
		System.out.println(al1.indexOf(5));
		System.out.println(al1.indexOf(null));
		System.out.println(al1.lastIndexOf(null));
		System.out.println(al1.lastIndexOf("A"));
		System.out.println(al1.lastIndexOf(new A(3, 5)));
		System.out.println();
		
		//update A class object whose data is 7 , 8 
		//by increasing x by 5 and y value 7
		System.out.println(al1);
		int index = al1.indexOf(new A(7, 8));
		if(index >= 0) {
			A a1 = (A)al1.get(index);
			a1.setX(a1.getX()+5);
			a1.setY(a1.getY()+7);
		}		
		System.out.println(al1);
		System.out.println();
		
//Operation #7:	removing an object from ArrayList -> here also equals() method and == operator are called 
		//we can remove element by index and also by object
		System.out.println(al1);
		System.out.println(al1.remove(5)); //here 5 is index, so 5th index object is removed
		System.out.println(al1);
		System.out.println(al1.remove((Integer)5)); //here 5 is object, so 5 is removed
		System.out.println(al1);
		System.out.println(al1.remove(6.7)); //here 6.7 is an object
	
		System.out.println(al1);
		ArrayList al2 = new ArrayList();	//Java 1.2v
		al2.add(null);
		al1.removeAll(al2);			//removing all occurrences of an element
		System.out.println(al1);
		
		al1.removeAll(List.of("a"));  //Java 9v static factory method to create
		System.out.println(al1);		// a unmodifiable collection with initialization

		al1.removeAll(Arrays.asList(new A(5,6))); //Java 1.2v static factory method to create
		System.out.println(al1);		// a unmodifiable collection with initialization 
		
		//al1.clear();
		//System.out.println(al1);
		
		
//		for (int i = 0; i < al1.size(); i++) {
//			Object ele = al1.get(i);
//			if (ele instanceof String) {
//				al1.remove(i);
//			}
//		}
 		
		
//		for(int i=0; i<al1.size(); i++) {
//			Object ele = al1.get(i);
//			if(((Integer)ele)%2==0) {
//				al1.remove(i);
//			}
//		}
		
//		for(int i=0; i<al1.size(); i++) {
//			Object ele = al1.get(i);
//			if(ele instanceof A) {
//				al1.remove(i);
//			}
//		}
		System.out.println();
		
		al1.removeIf(ele -> ele instanceof String);//Java 8v
		System.out.println(al1);
		al1.removeIf(ele -> ele instanceof Integer);//Java 8v
		System.out.println(al1);
		al1.removeIf(ele -> ele instanceof A);//Java 8v
		System.out.println(al1);
		System.out.println();
//Operation #8: inserting new element in AL		
		al1.clear();
		al1.add("a");
		al1.add("b");
		al1.add(5);
		al1.add(6.7);
		al1.add(true);
		al1.add(null);
		System.out.println(al1);
		al1.add(2, "C");
		System.out.println(al1);
		
		al1.add(al1.size(), "7"); //Rule #1: index>=0 && index<=size 
		System.out.println(al1);	//(index==size->add)
		
		//al1.add(al1.size() + 1, "8");
		//al1.add(-1, "8");

//Operation #9: replacing	an existing element with new element
		al1.set(3, 9);				//Rule #1: index>=0 && index<size
		System.out.println(al1);
		
		//al1.set(al1.size(), 10);
		
		
//Operation	#10: sorting elements	
		al1.clear();
		al1.add("a");
		al1.add("c");
		al1.add("b");
		System.out.println(al1);
		al1.sort(null);
		System.out.println(al1);
		
		
		
	} 
}
