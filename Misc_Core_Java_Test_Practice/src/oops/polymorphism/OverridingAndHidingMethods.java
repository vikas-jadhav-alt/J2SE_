package oops.polymorphism;

class Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Animal");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}

class Cat extends Animal {

	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat; // ---- (1)

		/**
		 * Object Type Casting Does Not Change: Type of Underlying Runtime Object, it
		 * changes only Reference Type (LEFT-HAND SIDE)
		 */
		/**
		 * At (1) ==> we have Reference Type = Animal, and Object Type (means Runtime
		 * Object) = Cat
		 */

		Animal.testClassMethod(); // The static method in Animal

		myCat.testClassMethod(); // The static method in Cat
		myCat.testInstanceMethod(); // The instance method in Cat

		myAnimal.testClassMethod(); // The static method in Animal
		myAnimal.testInstanceMethod(); // The instance method in Cat

	}
}

//OUTPUT:
//The static method in Animal
//The static method in Cat
//The instance method in Cat
//The static method in Animal
//The instance method in Cat