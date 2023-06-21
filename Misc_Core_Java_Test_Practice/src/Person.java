
public class Person {

	// class level member
	StringBuffer firstName;
	static StringBuffer lastName;

	public String addExtra() {

		// Local Variable
		StringBuilder sb = new StringBuilder();
		sb.append("Rahul").append(true);

		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		
//		System.out.println(null instanceof null);
	}

}
