//SBDescendingComparator.java 
//	(Sorting order logic should be FE- SE)
class SBDescendingComparator 
		implements java.util.Comparator{
	
	public int compare(Object o1, Object o2){

		StringBuffer sb1 = (StringBuffer)o1;
		StringBuffer sb2 = (StringBuffer)o2;

		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		return s2.compareTo(s1);
	}
}
