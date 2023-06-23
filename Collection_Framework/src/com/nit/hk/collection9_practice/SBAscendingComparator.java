//SBAscendingComparator.java 
//	(Sorting order logic should be SE - FE)
class SBAscendingComparator 
		implements java.util.Comparator{
	
	public int compare(Object o1, Object o2){

		StringBuffer sb1 = (StringBuffer)o1;
		StringBuffer sb2 = (StringBuffer)o2;

		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		return s1.compareTo(s2);
	}
}
