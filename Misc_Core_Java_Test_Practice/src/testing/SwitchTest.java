package testing;

/*The Java switch statement is fall-through. It means it Executes all statements after the
first match if a break statement is not present  ==> Even default statement*/
class TestNO {

	public static void main(String[] args) {

		int number = 20;
		// switch expression with int value
		switch (number) {
		// switch cases without break statements
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		default:
			System.out.println("Not in 10, 20 or 30");
		}

	}
}

//OUTOUT:
//20
//30
//Not in 10, 20 or 30

class TestNO1 {

	public static void main(String[] args) {

		int number = 20;
		// switch expression with int value
		switch (number) {
		// switch cases without break statements
		default:
			System.out.println("Not in 10, 20 or 30");
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");

		}

	}
}

//OUTPUT:
//20
//30

/** In Case of No Matching Default Statement Executes */
class TestNO2 {

	public static void main(String[] args) {

		int number = 50;
		switch (number) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		default:
			System.out.println("Not in 10, 20 or 30");

		}

	}
}

//OUTPUT:
//Not in 10, 20 or 30

/**
 * 
 * NOTE: default case always executes in case we don't find suitable case, and
 * here placement of default statement does not matter
 */
/**
 * Since Witch Statemtment is fall through: hence here comes the power of break
 * statement
 */
class TestNO3 {

	public static void main(String[] args) {

		int number = 50;
		switch (number) {
		default:
			System.out.println("Not in 10, 20 or 30");
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");

		}

	}
}

//OUTPUT:
//Not in 10, 20 or 30
//10
//20
//30

/** After using Break Statements */
class TestNO4 {

	public static void main(String[] args) {

		int number = 50;
		switch (number) {
		default:
			System.out.println("Not in 10, 20 or 30");
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");

		}

	}
}

//OUTPUT:
//Not in 10, 20 or 30
//10

class TestNO5 {

	public static void main(String[] args) {

		int number = 20;
		switch (number) {
		default:
			System.out.println("Not in 10, 20 or 30");
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");

		}

	}
}
//OUTPUT
//20
//30
