package com.nvit.hvk.collection9_practice;
//Student.java
class Student implements Comparable{
	int rollnum;
	String name;
	int classnum;
	
	Student(int rollnum, String name, int classnum){
		this.rollnum	= rollnum;
		this.name		= name;
		this.classnum	= classnum;
	}
	public int hashCode(){
		return classnum;
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student s = (Student)obj;
			return (
						this.rollnum == s.rollnum 
							&&
						this.name.equals(s.name)
							&&
						this.classnum == s.classnum
			);
		}

		return false;
	}
	public int compareTo(Object obj){
		Student s = (Student)obj;

		int classDiff = this.classnum - s.classnum;
		if (classDiff == 0){	
			return this.rollnum - s.rollnum;
		}
		else{
			return classDiff;
		}
	}
	public String toString(){
		
		return (
					"Student("+	rollnum	+ ", " +
											name		+ ", " +
											classnum	+ ")\n"
		);
	
	}
}