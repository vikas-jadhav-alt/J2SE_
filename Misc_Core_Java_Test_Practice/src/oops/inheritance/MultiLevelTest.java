package oops.inheritance;

class IntegerCalculator {
	int sum = 45;

	IntegerCalculator(int i){}
	public void accessParentSum() {
		System.out.println(sum); // or this.sum
	}

}

class DecimalCalculator extends IntegerCalculator {
	double sum = 15;

	
	DecimalCalculator(){
		super();
	}
	public void accessChildSum() {
		System.out.println(sum); // or this.sum //Child Sum
		System.out.println(super.sum); // Access Super Class Sum
	}

}

class TestM {
	public static void main(String[] args) {

		DecimalCalculator dc = new DecimalCalculator();
		System.out.println(dc.sum); // 15.0

		dc.accessParentSum(); // 45

		dc.accessChildSum();
//		15.0
//		45

		/** Doing Object-Type Cast */
		// NOTE: Meaning
		IntegerCalculator ic = dc;

		System.out.println(ic.sum); // 45

	}
}

//OUTPUT:
//15.0
//45
//15.0
//45
//45