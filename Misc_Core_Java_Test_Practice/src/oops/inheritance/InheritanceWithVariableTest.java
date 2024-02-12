package oops.inheritance;

/**Always We first check if method or variable (obviously- by name) accessed through is present in class whose reference is used, 
 * if not present then we go for immediate super class, and this process goes like parent by parent and when first match is found we accept it and no further searching happens*/

/**
 * Below Rules are applicable to Members (Both Attributes and Methods of Class)
 */

//Error Notes:
//Case: Member is Private: //CTE:xxx is not visible
//Case: Member is itself not present:  //xxx cannot be resolved or is not a field

class Ishwar {

	private String placeOfExistense = "EveryWhere";
	String brainPower = "infinite";
	boolean freedom = true;
	String dharm = "manvta";
	public static String ishwarStatic = "ishwarStatic";

	protected String protectedString = "protectedStringIshwar";

	public void commonMethod() {
		System.out.println("Ishwar-Common Method");
	}
}

class Manav extends Ishwar {

	String brainPower = "100%";
	int legs = 2;
	private String dharm = "fixed";
	private String marriage = "personal";
	public String pubString = "pubString";

	public static String manavStatic = "manavStatic";
	protected String protectedString = "protectedStringManav";

	public void commonMethod() {
		System.out.println("Manav-Common Method");
	}
}

class None extends Manav {

	int legs = 4;
	public static String noneStatic = "noneStatic";

	public void commonMethod() {
		System.out.println("None-Common Method");
	}

}

public class InheritanceWithVariableTest {

	public static void main(String[] args) {

		/**
		 * At Compiler Time: Compiler check if Member (variable or method) accessed by
		 * dot(.) operator is present in Reference Type or not, Otherwise we get CTE:
		 * Did not find method or can not resolve field or method
		 */

		None none = new None();

		/** Can not access Private Members (Attributes/Methods) */
//		System.out.println(none.kk); //CTE: kk cannot be resolved or is not a field
//		System.out.println(none.placeOfExistense); //CTE: The field Ishwar.placeOfExistense is not visible
//		System.out.println(none.marriage); //CTE: The field Manav.marriage is not visible

		/** Can Access: Default, Protected, Public scope members */

		/**
		 * Method Present Both in Subclass and Super Class => Overriding Takes Place:
		 * Resolution Based on Runtime Object
		 */
		/**
		 * Note: Overriding and Overloading Concepts are Applicable to Methods only not
		 * to Variables
		 */
		/**
		 * In case of variable: Variable resolution always takes based on Reference
		 * variable
		 */

		System.out.println(none.legs); // None.legs = 4
//		System.out.println(none.dharm); // CTE: The field Manav.dharm is not visible //Manav.dharm is private here, hence we are not going for Ishwar class has already we have found member in Manav

		// After Object Type-Casting:
		// Note: In Objetc Type Casting, we don't change underlying object, instead we
		// just change the reference type to access that object

		Ishwar noneTC2Ishwar1 = none;
		Ishwar noneTC2Ishwar2 = (Ishwar) none;
		Ishwar noneTC2Ishwar3 = (Manav) none;
		System.out.println("-> " + noneTC2Ishwar1.dharm); // -> manvta
		System.out.println("-> " + noneTC2Ishwar2.dharm); // -> manvta
		System.out.println("-> " + noneTC2Ishwar3.dharm); // -> manvta

		System.out.println("=====================");
		none.commonMethod(); // None-Common Method
		noneTC2Ishwar1.commonMethod(); // None-Common Method
		noneTC2Ishwar2.commonMethod(); // None-Common Method
		noneTC2Ishwar3.commonMethod(); // None-Common Method

//		System.out.println(none.placeOfExistense); //CTE: The field Ishwar.placeOfExistense is not visible
//		System.out.println(none.notPresent); // CTE: notPresent cannot be resolved or is not a field
		System.out.println(none.protectedString); // protectedStringManav

		Ishwar ishwarNone = new None();

		System.out.println(ishwarNone.dharm); // manvta
		System.out.println(ishwarNone.protectedString); // protectedStringIshwar

	}

}

//OUTPUT:
//4
//-> manvta
//-> manvta
//-> manvta
//=====================
//None-Common Method
//None-Common Method
//None-Common Method
//None-Common Method
//protectedStringManav
//manvta
//protectedStringIshwar
