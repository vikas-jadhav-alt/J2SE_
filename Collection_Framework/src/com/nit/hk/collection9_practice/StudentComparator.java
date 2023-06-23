import java.util.*;

class StudentComparator implements Comparator  {
	public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;

			return s2.compareTo(s1);
	}
}
