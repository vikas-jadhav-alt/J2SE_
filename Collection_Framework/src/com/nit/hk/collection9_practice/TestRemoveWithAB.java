import java.util.*;

class  TestRemoveWithAB{
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = 
			new LinkedHashSet<Integer>();
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		lhs.add(1);
		lhs.add(2);
		lhs.add(3);

		al.add(1);
		al.add(2);
		al.add(3);

		System.out.println("lhs elements\n"+lhs);
		System.out.println("al elements\n"+al);
		System.out.println();

		lhs.remove(1);
		al.remove(1);
		al.remove((Integer)1);
		System.out.println("lhs elements\n"+lhs);
		System.out.println("al elements\n"+al);

		lhs.remove(3);
		System.out.println("lhs elements\n"+lhs);

		al.remove((Integer)3);
		System.out.println("al elements\n"+al);
	}
}
