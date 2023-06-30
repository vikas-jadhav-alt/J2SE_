package com.nvit.hvk.collection9_practice;
//Employee.java
import java.util.*;

public class  Employee 
		implements Comparable<Employee>{

	int			eid;
	String		ename;
	String		dept;
	int			exp;
	
	public Employee(int eid, String ename, String dept, int exp){
		this.eid			= eid;
		this.ename		= ename;
		this.dept			= dept;
		this.exp			= exp;
	}
	
	public int compareTo(Employee e){

		int res = this.ename.compareTo(e.ename) ;
		if (res == 0){

			res = this.dept.compareTo(e.dept);
			if (res == 0){
				res = this.eid - e.eid;
			}
		}
		return res;
	}
	public String toString(){
		return "Emp("+eid+", "+ename+", "+dept+", "+exp+")\n";
	}
}
