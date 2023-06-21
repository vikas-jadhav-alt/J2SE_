package project.custom_collection;

import java.util.Arrays;

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

		if (index < 0 || index > size())
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
		for (int i = index; i < count - 1; index++) {
			list[i] = list[i + 1];
		}

		list[count - 1] = null;

		count--; // decrease size

		return ret;
	}

	// Remove By Object : Object
	// Insert : insert
	// Replace : set

	// General Method Displaying Retrieving and then updating

	class Main {
		public static void main(String[] args) {
			VikasCollection col = new VikasCollection(2);

			col.add("Mohan");
			col.add(Integer.valueOf(67));
			col.add("a"); // String class object added
			col.add('a'); // character added: internal converted to Wrapper Class: Character
			col.add('b');
			col.add(true);
			col.add(67);
			col.add(34.6);
			col.add(new Student(11, "Elevan"));
			col.add(new Student(12, "Twelve"));
			col.add(new Student(11, "Elevan"));
			col.add(new Student(13, "Thirteen"));
			col.add(18);

			System.out.println(col); // internally calling: toString() method
			System.out.println("Size: " + col.size());
			System.out.println("Capacity: " + col.capacity());

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

			System.out.println(col); // internally calling: toString() method
			System.out.println("Size: " + col.size());
			System.out.println("Capacity: " + col.capacity());

			System.out.println("Removing Student(13) " + col.remove(13));
			System.out.println("Size: " + col.size());
			System.out.println("Capacity: " + col.capacity());

		}
	}
}
