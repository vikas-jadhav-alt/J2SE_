
interface Calc {

	void m(long a);

}

interface CalcString {

	long m(long a);

}

class Arithmetic {

	private static int calc(int a) {
		return a + 2;
	}

	private static int calcLong(long a) {
		return (int) a + 2;
	}

	public static void main(String[] args) {
		System.out.println("running...");

		/**
		 * While Declaring The Method Reference also: there must be exact match of
		 * Arguments
		 */
		// CTE:The type Arithmetic does not define calc(long) that is applicable here
//		Calc add = Arithmetic::calc;
//		------

		/** ---------------------------------------------------------- */
		Calc add = Arithmetic::calcLong;

		// CTE: The method println(boolean) in the type PrintStream is not applicable
		// for the arguments (void)
//		System.out.println(add.m((int) 2));

		/** ---------------------------------------------------------- */

		CalcString sub = Arithmetic::calcLong;

		System.out.println(sub.m((int) 2));// 4

	}
}

//OUTPUT:
//running...
//4
