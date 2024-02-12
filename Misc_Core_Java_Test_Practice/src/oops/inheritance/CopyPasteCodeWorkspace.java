package oops.inheritance;

//class Horse {

//	public String identifyMyself() {
//		return "I am a horse.";
//	}
//}
//
//interface Flyer {
//	default String identifyMyself() {
//		return "I am able to fly.";
//	}
//}
//
//interface Mythical {
//	default String identifyMyself() {
//		return "I am a mythical creature.";
//	}
//}
//
//class Pegasus extends Horse implements Flyer, Mythical {
//	public static void main(String... args) {
//		Pegasus myApp = new Pegasus();
//		System.out.println(myApp.identifyMyself()); //I am a horse.
//	}
//}

//interface Animal {
//	default public String identifyMyself() {
//		return "I am an animal.";
//	}
//}
//
//interface EggLayer extends Animal {
//	default public String identifyMyself() {
//		return "I am able to lay eggs.";
//	}
//}
//
//interface FireBreather extends Animal {
//	default public String identifyMyself() {
//		return "I am Fire Breather";
//	}
//
//}
//
//class Dragon implements EggLayer, FireBreather {
//
//	public String identifyMyself() {
//		String egg = EggLayer.super.identifyMyself();
//		String fire = FireBreather.super.identifyMyself();
//		return egg + " " + fire;
//
//	}
//
//	public static void main(String... args) {
//		Dragon myApp = new Dragon();
//		System.out.println(myApp.identifyMyself()); //I am able to lay eggs. I am Fire Breather
//	}
//}

///**
// * Inherited instance methods from classes can override abstract interface
// * methods.
// */
//interface Mammal {
//	String identifyMyself();
//}
//
//class Horse {
//	public String identifyMyself() {
//		return "I am a horse.";
//	}
//}
//
//class Mustang extends Horse implements Mammal {
//	public static void main(String... args) {
//		Mustang myApp = new Mustang();
//		System.out.println(myApp.identifyMyself()); // I am a horse.
//	}
//}

///**
// * The method Mustang.identifyMyself returns the string I am a horse. The class
// * Mustang inherits the method identifyMyself from the class Horse, which
// * overrides the abstract method of the same name in the interface Mammal.
// * 
// */

//=================================
//
//class Bicycle {
//
//	// the Bicycle class has three fields
//	public int cadence;
//	public int gear;
//	public int speed;
//
//	// the Bicycle class has one constructor
//	public Bicycle(int startCadence, int startSpeed, int startGear) {
//		gear = startGear;
//		cadence = startCadence;
//		speed = startSpeed;
//	}
//
//	// the Bicycle class has four methods
//	public void setCadence(int newValue) {
//		cadence = newValue;
//	}
//
//	public void setGear(int newValue) {
//		gear = newValue;
//	}
//
//	public void applyBrake(int decrement) {
//		speed -= decrement;
//	}
//
//	public void speedUp(int increment) {
//		speed += increment;
//	}
//
//	public void printDescription() {
//		System.out.println("\nBike is " + "in gear " + this.gear + " with a cadence of " + this.cadence
//				+ " and travelling at a speed of " + this.speed + ". ");
//	}
//
//}
//
//class MountainBike extends Bicycle {
//	private String suspension;
//
//	public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
//		super(startCadence, startSpeed, startGear);
//		this.setSuspension(suspensionType);
//	}
//
//	public String getSuspension() {
//		return this.suspension;
//	}
//
//	public void setSuspension(String suspensionType) {
//		this.suspension = suspensionType;
//	}
//
//	public void printDescription() {
//		super.printDescription();
//		System.out.println("The " + "MountainBike has a" + getSuspension() + " suspension.");
//	}
//}
//
//class RoadBike extends Bicycle {
//	// In millimeters (mm)
//	private int tireWidth;
//
//	public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
//		super(startCadence, startSpeed, startGear);
//		this.setTireWidth(newTireWidth);
//	}
//
//	public int getTireWidth() {
//		return this.tireWidth;
//	}
//
//	public void setTireWidth(int newTireWidth) {
//		this.tireWidth = newTireWidth;
//	}
//
//	public void printDescription() {
//		super.printDescription();
//		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
//	}
//}
//
//class TestBikes {
//	public static void main(String[] args) {
//		Bicycle bike01, bike02, bike03;
//
//		bike01 = new Bicycle(20, 10, 1);
//		bike02 = new MountainBike(20, 10, 5, "Dual");
//		bike03 = new RoadBike(40, 20, 8, 23);
//
//		bike01.printDescription();
//		bike02.printDescription();
//		bike03.printDescription();
//	}
//}
//
////OUTPUT:
//Bike is in gear 1 with a cadence of 20 and travelling at a speed of 10. 
//
//Bike is in gear 5 with a cadence of 20 and travelling at a speed of 10. 
//The MountainBike has aDual suspension.
//
//Bike is in gear 8 with a cadence of 40 and travelling at a speed of 20. 
//The RoadBike has 23 MM tires.

//Java Program to demonstrate

////Constructor
//import java.io.*;
//
//class Geeks {
//
//	// Parameterised (No-Arg) Constructor - Explicitely Defined
//	Geeks() {
//		super(); // Calling Object class constructor
//		System.out.println("Constructor Called");
//	}
//
//	Geeks(String name, int id) {
//		//Implicitely adding super() by Compiler
//		System.out.println("Parameterised Const Called");
//	}
//
//	// main function
//	public static void main(String[] args) {
//		Geeks geek = new Geeks("",8);
//		System.out.println("Ending");
//	}
//}
//
////OUTPUT
////Parameterised Const Called
////Ending

//Java Program for Copy Constructor
import java.io.*;

class Geek {
	// data members of the class.
	String name;
	int id;

	// Parameterized Constructor
	Geek(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Copy Constructor
	Geek(Geek obj2) {
		this.name = obj2.name;
		this.id = obj2.id;
	}
}

class GFG {
	public static void main(String[] args) {
		// This would invoke the parameterized constructor.
		System.out.println("First Object");
		Geek geek1 = new Geek("avinash", 68);
		System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);

		System.out.println();

		// This would invoke the copy constructor.
		Geek geek2 = new Geek(geek1);
		System.out.println("Copy Constructor used Second Object");
		System.out.println("GeekName :" + geek2.name + " and GeekId :" + geek2.id);
	}
}

//OUTPUT:
//First Object
//GeekName :avinash and GeekId :68
//
//Copy Constructor used Second Object
//GeekName :avinash and GeekId :68
