import java.util.*;

class IntegerComparator implements Comparator  {
	public int compare(Object o1, Object o2) {
			Integer io1 = (Integer)o1;
			Integer io2 = (Integer)o2;

			return io2.compareTo(io1);
	}
}
