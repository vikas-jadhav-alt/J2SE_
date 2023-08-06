package practice.eight;

class Laptop {

	static int statBrand5 = 5;
	int intanceBrand6 = 6;

	public static void statMethod() {
		System.out.println("Static Method");
	}

	public void instanceMethod() {
		System.out.println("Instance Method");
	}

}

public class FeaturesOfNull {

	static int rounds;
	String sname;
	static Integer count;

	public static void main(String[] args) {

		// Point 1
		/**
		 * null is applicable to Reference Data Type only, not to primitive data types
		 */
		String s = null;
		int[] arr = null;
		/** Error: Type Mismatch */
//		int i1 = null; //CTE: Type mismatch: cannot convert from null to int
//		int i2 = "HK"; //CTE: Type mismatch: cannot convert from String to int

		// Point 2
		/** CTE: Ambiguous Error: Compiler does not know type of null */
		System.out.println(10); // 10 //Compiler know 10 is int (specific data type)
//		System.out.println(null); // CTE: The method println(char[]) is ambiguous for the type PrintStream
		/** Two Ways to Assign Specific Type to null */
		String str = null;
		System.out.println(str); // null
		System.out.println((String) null); // null

		// Point 3
		/** null as default value for static|instance members */
		System.out.println(rounds + " " + new FeaturesOfNull().sname + " " + count);// 0 null null
		/* default value to local not assigned */
		String j;
//		System.out.println(j); //CTE: The local variable j may not have been initialized
		int k;
//		System.out.println(k); //CTE: ;The local variable k may not have been initialized		

//		Point: 4
		/** RTE: Null Pointer Exception */
		String g = null;
//		System.out.println(g.toUpperCase()); // RTE: java.lang.NullPointerException

		// CTE: Derefrencing error, No Specific Data Type, can not invoke method
//		System.out.println(null.toUpperCase()); // CTE: Cannot invoke toUpperCase() on the primitive type null
//		System.out.println((String)null.subString()); // CTE: Cannot invoke subString() on the primitive type null

		// Point 5;
		/** Use of == operator */
		System.out.println("use of == operator");
		String s1 = "33";
		String s2 = null;
		System.out.println(s1 == null); // false
		System.out.println(s2 == null); // true
		System.out.println(null == null); // true
		System.out.println((String) null == null); // true
		System.out.println(null != null); // false

		// Point 6;
		/** Use instanceof operator */
		System.out.println("use instanceof operator");
		Integer i = 10;
		Integer gg = null;

		System.out.println(i instanceof Integer);// true
		System.out.println(null instanceof Integer); // false
		System.out.println(gg instanceof Integer); // false

//		System.out.println(null instanceof null); // CTE: Not a correct Syntax: Incompatible conditional operand types 

		// Point 7;
		/** using equals() method */
		System.out.println("-----------using equals() method");

		String ss = "something";
		String jj = null;

		System.out.println(ss.equals(null)); // false
//		System.out.println(jj.equals(null)); //RTE: java.lang.NullPointerException:
//		System.out.println((String)null.equals(null)); //CTE: Cannot invoke equals(null) on the primitive type null

		// Point 8;
		/** null vs NULL vs Empty String */
		System.out.println("---null NULL Empty String----");

//		String sk = NULL; //CTE: NULL cannot be resolved to a variable

		String s11 = "";
		System.out.println(s11.length()); // 0

		String s22 = null;
//		System.out.println(s2.length()); // RTE: NullPointerException

		// Point 9;
		/** Nullifying the Reference and Passing to GC */
		System.out.println("Passing to GC");

		String sttr = "something" + "asking";
		System.out.println(sttr); // somethingasking

		sttr = null;// Sending to GC
		System.out.println(sttr); // null

		// Point 10;
		/** Accessing Static Members */
		System.out.println("Accessing Static Members");

		Laptop laptop = null;
		System.out.println(laptop.statBrand5); // 5
		laptop.statMethod(); // Static Method

		System.out.println(laptop.intanceBrand6); // RTE: NullPointerException

	}
}
