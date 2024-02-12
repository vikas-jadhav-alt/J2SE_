package oops.inheritance;

class ParentX {
	private void mp() {
		System.out.println("Parent Method");
	}

	public void testmp() {
		mp();
	}

}

class ChildX extends ParentX {

	private void mc() {
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		/**
		 * // Private as Class Scope Only. Hence we can't access the ParentX.mp() in
		 * this class ChildX
		 * 
		 * // But we can access ChildX.mc here as this method main() and method: mc():
		 * both are in same scope.
		 */

		ParentX p = new ChildX();
//		p.mp(); //CTE: The method mp() from the type ParentX is not visible

		/** But we can access testmp() which internally can access the mp() */
		p.testmp(); // Parent Method

		ChildX c = (ChildX) p;
		c.mc(); // Child Method
		// here we are able to call private method: as Private is in Same Scope in which
		// we are calling it.

	}

}

//OUTPUT:
//Parent Method
//Child Method
