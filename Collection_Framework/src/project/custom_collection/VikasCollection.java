package project.custom_collection;

import java.util.Arrays;

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

	class Main {
		public static void main(String[] args) {
			VikasCollection list = new VikasCollection(2);

			list.add("Mohan");
			list.add(Integer.valueOf(67));
			list.add(Integer.valueOf(69));
			list.add(Integer.valueOf(34));
			list.add(Integer.valueOf(6787));
			list.add(Integer.valueOf(674));
			list.add(Integer.valueOf(6740));
			list.add(Integer.valueOf(600));
			list.add(Integer.valueOf(700));

			System.out.println(list);
		}
	}
}

