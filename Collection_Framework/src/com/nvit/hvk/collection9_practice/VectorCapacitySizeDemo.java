package com.nvit.hvk.collection9_practice;
//VectorCapacitySizeDemo.java
import java.util.Vector;

//Address.java
class Address {

	String hno, street, city, ph;

	Address(String hno, String street, String city, String ph) {

		this.hno = hno;
		this.street = street;
		this.city = city;
		this.ph = ph;
	}
}
//Customer.java
class Customer {

	String name; 	int age;   Address address;
	
	Customer(String name, int age, Address address)	{
		this.name 	= name;
		this.age 	= age;
		this.address 	= address;
	}
	public String toString(){
		return (	"Name: " + name + "\nAge: " + age +
				"\nH.No: " + address.hno + "\nStreet: " + address.street +
				"\nCity: " + address.city+"\nph"+address.ph
		);
	}
}


public class VectorCapacitySizeDemo {
	public static void main(String[] args) 	{
		Vector v = new Vector(3);

		System.out.println("Intial Capacity and Size of Vector is..");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size	: " + v.size());
		
		System.out.println();
		
		Customer c1 = new Customer("Newton", 30 ,
new Address("2-3-102/1",  
"Ameerpet","Hyderabad","12345"));
		Customer c2 = new Customer("Einstene",23,
new Address("1-10-1022/3", 
"Kukatpally","Hyderabad","23345"));
		Customer c3 = new Customer("Clinton",31,
new Address("1-3-32", 
"Amberpet","SecBad","33345"));
		Customer c4	=new Customer("Ken Thomposn",31,
new Address("1-3-32", 
"Amberpet","SecBad","33345"));
		Customer c5 = new Customer("Edward Shepered",31,
new Address("1-3-32", 
"Amberpet","SecBad","33345"));
		Customer c6 = new Customer("Michael Slater",31,
new Address("1-3-32", 
 	"Amberpet","SecBad","33345"));
		Customer c7 = new Customer("Justin Langer",31,
new Address("1-3-32", 
"Amberpet","SecBad","33345"));
		
		v.add(c1);
		v.add(c2);
		
		System.out.println("Reached  its Capacity....Or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size	: " + v.size());
		System.out.println();
		
		v.add(c3);
		System.out.println("Reached  its Capacity....Or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size	: " + v.size());
		System.out.println();
		
		v.add(c4);
		System.out.println("Reached  its Capacity....Or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size	: " + v.size());
		System.out.println();
		
		v.add(c5);
		v.add(c6);
		System.out.println("Reached  its Capacity....Or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size	: " + v.size());
		System.out.println();
		
		v.add(c7);
		System.out.println("Capacity Increased...and Size of Vector Altered..");	
		System.out.println("Capacity: " + v.capacity());	
		System.out.println("Size	: " + v.size());
		System.out.println();	

		System.out.println("The customer labels are: ");	
		System.out.println();
		
		for (int i = 0;  i < v.size() ; i++) {
			System.out.println(v.get(i));
			System.out.println();
		}
	}
}
