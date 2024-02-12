package oops.inheritance;



//==> Overriding Instance Methods and Hiding Static Method
//==> Hiding Fields

class Parent {
	String parentInstance = "parentInstance";
	static String parentStatic = "parentStatic";
	String pcInstanceSameName = "parentInstanceSameName";
	static String pcStaticSameName = "parentStaticSameName";
	
	int pcCountField = 5;

	public void parentInstanceMethod() {
		System.out.println("-->| parent Instance Method |<--");
	}

	public static void parentStaticMethod() {
		System.out.println("-->| parent Static Method |<--");
	}

	public void pcInstanceMethod() {
		System.out.println("-->| Parent (SameName) Instance Method |<--");
	}

	public static void pcStaticMethod() {
		System.out.println("-->| Parent (SameName) Static Method |<--");
	}

}

class Child extends Parent {
	String childInstance = "childInstance";
	static String childStatic = "childStatic";
	String pcInstanceSameName = "childInstanceSameName";
	static String pcStaticSameName = "childStaticSameName";
	
	String pcCountField = "String5";

	public void childInstanceMethod() {
		System.out.println("-->| Child Instance Method |<--");
	}

	public static void childStaticMethod() {
		System.out.println("-->| Child Static Method |<--");
	}

	public void pcInstanceMethod() {
		System.out.println("-->| Child (SameName) Instance Method |<--");
	}

	public static void pcStaticMethod() {
		System.out.println("-->| Child (SameName) Static Method |<--");
	}

}

class Test {
	
	public static void main(String[] args) {
		Child c = new Child();
		
		//Access Fields
		//Child class has its own and inherited members of Parent Class
		System.out.println(c.childInstance); 		//childInstance
		System.out.println(c.parentInstance); 		//parentInstance
		System.out.println(c.childStatic);			//childStatic
		System.out.println(Child.childStatic);		//childStatic
		System.out.println(c.parentStatic);			//parentStatic
		System.out.println(Parent.parentStatic);	//parentStatic
		
		/**Hiding Fields*/
		System.out.println(c.pcInstanceSameName);	//childInstanceSameName
		System.out.println(c.pcStaticSameName);		//childStaticSameName
		System.out.println(Parent.pcStaticSameName);//parentStaticSameName
		
		System.out.println();
		
		//OUTPUT
//		childInstance
//		parentInstance
//		childStatic
//		childStatic
//		parentStatic
//		parentStatic
//		childInstanceSameName
//		childStaticSameName
//		parentStaticSameName
		
		System.out.println("*************************");
		//Access Methods
		c.childInstanceMethod(); //-->| Child Instance Method |<--
		c.childStaticMethod();  //-->| Child Static Method |<--
		Child.childStaticMethod();	//-->| Child Static Method |<--
		c.parentInstanceMethod();	//-->| parent Instance Method |<--
		c.parentStaticMethod();		//-->| parent Static Method |<--
		Parent.parentStaticMethod();	//-->| parent Static Method |<--
		
		//Overriding Instance Method
		c.pcInstanceMethod();	//-->| Child (SameName) Instance Method |<--
		
		/**Hiding Static Method*/
		c.pcStaticMethod();		//-->| Child (SameName) Instance Method |<--
		
		Parent.pcStaticMethod();	//-->| Parent (SameName) Static Method |<--
		
		System.out.println("------------------------------");
		Parent p = new Child();
		p.pcStaticMethod();  //-->| Parent (SameName) Static Method |<--

		
		
		//OUTPUT
//		*************************
//		-->| Child Instance Method |<--
//		-->| Child Static Method |<--
//		-->| Child Static Method |<--
//		-->| parent Instance Method |<--
//		-->| parent Static Method |<--
//		-->| parent Static Method |<--
//		-->| Child (SameName) Instance Method |<--
//		-->| Child (SameName) Static Method |<--
//		-->| Parent (SameName) Static Method |<--
//		------------------------------
//		-->| Parent (SameName) Static Method |<--

		

		
		
		
		/**Parent Can't Inherit Child*/
//		p.childInstanceMethod(); //CTE: The method childInstanceMethod() is undefined for the type Parent
		
		
		/**Hiding Different Data Types As Well*/
		System.out.println(c.pcCountField); //String5
		System.out.println(p.pcCountField);	//5
		
	}

}