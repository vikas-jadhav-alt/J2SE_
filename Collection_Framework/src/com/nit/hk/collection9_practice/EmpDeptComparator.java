class  EmpDeptComparator 
		implements java.util.Comparator<Employee>{
	
	public int compare(Employee e1 , Employee e2){
		return e1.dept.compareTo(e2.dept);	
	}
}
