package project.custom_collection;

import java.util.Arrays;

/*Tips:*/
/**To Shift To Left: Start from left end point: (Remove Operation)
 * To Shift To Right: Start from right end point: (Insert Operation)
 * 
 */

/* 9 Operation of Collection*/
/**
 * 1. Add		- Append at end	=> add(x)::void
 * 				- grow()::void
 * 2. Insert	- in b/w		=> add(x,y)::void
 * 3. count		- size of list	=> size()::int, capacity()::int
 * 4. print		- toString()::String   
 * 5. search	- contains(Object)::boolean
 * 				- indexOf(Object)::int
 * 				- lastIndexOf(Object)::int
 * 6. retrieve	- get(int)::Object
 * 				- checkIndex(int)::void
 * 7. remove	- remove(int)::Object
 * 				- remove(Object)::boolean
 * 8. Replace	- set(int,Object)::Object
 * 
 * Other Method:
 * 1. equals()
 */

import project.custom_collection.demostration.equal.Student;

//Clone of ArrayList and Vector
class VikasCollection {

	private Object[] list;
	private int count;

	VikasCollection(int capacity) {
		this.list = new Object[capacity];
		int count = 0;
	}

	public void add(Object o) {
		// To Avoid ArrayOutOfBoundIndex Exception
		if (size() == capacity()) {
			grow();
		}
		this.list[count++] = o;
	}

	private void grow() {
		// doubling size each time capacity becomes full
		Object[] newArray = new Object[capacity() * 2];

		for (int i = 0; i < size(); i++) {
			newArray[i] = list[i];
		}

		list = newArray;

	}

	public int size() {
		return count;
	}

	public int capacity() {
		return list.length;
	}

//	@Override
//	public String toString() {
//		return Arrays.toString(list); 
	// [Mohan,67,69,34,6787,674,6740,600,700,null,null,null,null,null,null,null ]
//
//	}

	@Override
	public String toString() {

// WAY 1: ==========================================Using java.util.Arrays
// method
// return Arrays.toString(list);

/// WAY 2: ==========================================================Using
/// String

// if (count == 0) {
// return "[]";
// }

// String str = "[";
// for (int i = 0; i < count; i++) {

// if (list[i] == null) {
// str = str + null + " ";
// // using concat(null) ==> NullPointerException
// continue;
// }

// // str = str + list[i].toString() + " ";
// str = str.concat(list[i].toString() + " ");
// }

// str = str.trim().replaceAll(" ", ", ");
// str = str.concat("]");

// return str;

// Wya 3: ====================================Using StringBuffer or
// StringBuilder

		if (count == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < count; i++) {
			sb.append(list[i]); // here no need to use toString() method, if arg = null also accepted and
								// handled
								// internally otherwise creates problem of NullPointerException if found Object
								// = null;
			sb.append(", ");
		}

		int start = sb.lastIndexOf(", ");
		int end = start + 2;
		sb.delete(start, end);

		sb.append("]");

		return sb.toString();

//		output example:
//			C:\Users\vikas\Desktop\JAVA WORKSPACES\Collection>java Main
//			[]
//			Size: 0
//			Capacity: 5
//			
//			[Mohan, Me Crazy, 6, 3.5, Main@15db9742, null, true]
//			Size: 7
//			Capacity: 10

	}

	// Search Operation: contains: boolean
	// Searching Algorithms: linear, binary, etc.
	public boolean contains(Object obj) {
		return indexOf(obj) >= 0;
	}

	// First Index of: indexOf: int
	public int indexOf(Object obj) {

		// obj can be null, and also to avoid RTE: Null Pointer Exception
		if (obj == null) {
			for (int i = 0; i <= count; i++) {
				if (list[i] == null) { // instead of if(list[i] == obj) for Time Performace
					return i;
				}
			}
		} else {
			for (int i = 0; i <= count; i++) {
				if (obj.equals(list[i])) { // Note: Pattern of Writing Code: here we are calling "equals" method of
											// "obj" not of "list[i]"
					return i;
				}
			}

		}

		return -1; // return -1 if not found
	}

	// Last Index of Operation: contains: int
	public int lastIndexOf(Object obj) {

		// obj can be null, and also to avoid RTE: Null Pointer Exception
		if (obj == null) {
			for (int i = count; i >= 0; i--) {
				if (list[i] == null) { // instead of if(list[i] == obj) for Time Performace: CPU Cycles
					return i;
				}
			}
		} else {
			for (int i = count; i >= 0; i--) {
				if (obj.equals(list[i])) { // Note: Pattern of Writing Code: here we are calling "equals" method of
											// "obj" not of "list[i]"
					return i;
				}
			}

		}

		return -1;
	}

	private void checkIndex(int index) {

		if (index < 0 || index > count)
			throw new IndexOutOfBoundsException(index + " must be in range: [0," + size() + "]");

	}

	// Retrieve Operation: get: object
	public Object get(int index) {
		// First Check Index
		checkIndex(index);

		return list[index];
	}

	// Remove By Index : Object
	public Object remove(int index) {
		checkIndex(index);

		Object ret = list[index];

		// remove and shift by left
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}

		list[count - 1] = null;

		count--; // decrease size

		return ret;
	}

	// Remove By Object : Object
	public boolean remove(Object obj) {

		int index = indexOf(obj);
		if (index == -1)
			return false;
		remove(index);
		return true;
	}

	// Insert : insert
	public void add(int index, Object obj) {
		checkIndex(index);

		if (size() == capacity())
			grow();

		// Shifting to Right
		for (int i = count - 1; i >= index; i--) {
			list[i + 1] = list[i]; // Here we are assigning reference variable, not actual values as Array always
									// store Reference Values;s
		}

		list[index] = obj;
		count++;

	}

	// Replace : set
	public Object set(int index, Object input) {
		checkIndex(index);

		Object obj = list[index];

		list[index] = input;

		return obj;

	}

	// Sorting Operation: There are many algorithm available to sort: we can
	// implement them as we have implemented all above operations

	// General Method Displaying Retrieving and then updating

	class Main {
		public static void main(String[] args) {
			VikasCollection col = new VikasCollection(2);

			col.add("Mohan");
			col.add(Integer.valueOf(67));
			col.add("a"); // String class object added
			col.add('b');
			col.add('a'); // character added: internal converted to Wrapper Class: Character
			col.add(true);
			col.add(67);
			col.add(34.6);
			col.add(new Student(11, "Elevan"));
			col.add(new Student(12, "Twelve"));
			col.add(new Student(11, "Elevan"));
			col.add(new Student(13, "Thirteen"));
			col.add(18);

			System.out.println(col); // internally calling: toString() method
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

			// Search and Index of
			System.out.println(col.contains("a"));
			System.out.println(col.indexOf("a"));
			System.out.println(col.indexOf('a'));

			System.out.println("\"b\" present: " + col.contains("b"));
			System.out.println(col.indexOf("b"));
			System.out.println(col.lastIndexOf("b"));
			System.out.println("'b' present: " + col.contains('b'));

			System.out.println(col.indexOf(new Student(11, "Elevan")));
			System.out.println(col.lastIndexOf(new Student(11, "Elevan")));

			System.out.println(col.get(4));
//			System.out.println(col.get(16)); //IndexOutOfBoundException

			System.out.println("Removing========");

			System.out.println(col);
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

			System.out.println("Index:11 : " + col.get(11));
			System.out.println("Removing Index:11 =>  " + col.remove(11));
			System.out.println(col);
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

			System.out.println("Removing 34.6 =>  " + col.remove(34.6));
			System.out.println(col);
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

			col.add(9, "John");
			System.out.println(col);
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

			System.out.println("Insert (6, 90.7) ==> " + col.set(6, 90.7));
			System.out.println(col);
			System.out.println("Size: " + col.size() + ", Capacity: " + col.capacity());

		}
	}
}
