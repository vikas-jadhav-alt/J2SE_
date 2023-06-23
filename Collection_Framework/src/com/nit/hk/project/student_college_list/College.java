package com.nit.hk.project.student_college_list;

import java.util.ArrayList;
import java.util.Scanner;

public class College {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		Scanner scn = new Scanner(System.in);

		String option = "N";
		do {
			Student s = new Student();
			System.out.print("Enter sno\t: ");
			s.setSno(scn.nextInt()); scn.nextLine();
			
			System.out.print("Enter sname\t: ");
			s.setSname(scn.nextLine());
			
			System.out.print("Enter course\t: ");
			s.setCourse(scn.nextLine());
			
			System.out.print("Enter fee\t: ");
			s.setFee(scn.nextDouble());
			
			al.add(s);
			System.out.println("Student object is saved");
			
			System.out.print("Do You want to continue?(Y/N):");
			option = scn.next();
			
		}while(option.equalsIgnoreCase("Y"));
		
		System.out.println("Number of student joined in college are: "+ al.size());
		System.out.println("The students are:");
		System.out.println(al);
		System.out.println();

		do {
			System.out.println("Enter student details whom you want to find");
			
			Student s1 = new Student();
			System.out.print("  Enter Sno: ");
			s1.setSno(scn.nextInt()); scn.nextLine();
			
			System.out.print("  Enter course: ");
			s1.setCourse(scn.nextLine());
	
			System.out.print("  Enter name: ");
			String name = scn.nextLine();
			
			//if(al.contains(s1)) {
			int studentIndex = al.indexOf(s1);
			if(studentIndex >=0 ) {
				Student student = al.get(studentIndex);
				if(student.getSname().equalsIgnoreCase(name))
					System.out.println("Student "+name+" is available");
				else 
					System.out.println("Student is available but he is not "+name);
				
			}else {
				System.out.println("Student HK is not available");
			}
			
			System.out.print("Do you want to continue?(Y/N): ");
			option = scn.next();
			
		}while(option.equalsIgnoreCase("Y"));
		
		System.out.println();
		
		do {
			
			System.out.println("Enter student details whose data you want to update");
			
			Student s1 = new Student();
			System.out.print("  Enter Sno: ");
			s1.setSno(scn.nextInt()); scn.nextLine();
			
			System.out.print("  Enter course: ");
			s1.setCourse(scn.nextLine());
	
			System.out.print("  Enter name: ");
			String name = scn.nextLine();

			int studentIndex = al.indexOf(s1);
			if(studentIndex >= 0) {
				Student student = al.get(studentIndex);
				if(student.getSname().equalsIgnoreCase(name)) {
					System.out.print("Enter new course: ");
					student.setCourse(student.getCourse()+", "+scn.nextLine());
					
					System.out.print("Enter fee of this new course: ");
					student.setFee(student.getFee()+scn.nextDouble()); scn.nextLine();
					
					System.out.println("Student data is updated");
					System.out.println("\nnew data is");
					System.out.println(student);
					
				}else {
					System.out.println("Student is available with diff name"); 
				}
			}else {
				System.out.println("Student is not available with the given details"); 
				
			}
			
			System.out.print("Do you want to continue?(Y/N):");
			option = scn.next();
			
		}while(option.equalsIgnoreCase("Y"));
		
		System.out.println("\nUpdated detials of all students");
		System.out.println(al);
		
	}
}
