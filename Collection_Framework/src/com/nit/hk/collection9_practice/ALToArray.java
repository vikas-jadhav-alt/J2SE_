class ALToArray {
	public static void main(String[] args) {

		ArrayList<String> al = 
				new ArrayList<String>();
		
		Object[] obj = al.toArray();
		System.out.println(obj);
	
		String[] sa = new String[ al.size() ];
		al.toArray(sa);
		System.out.println(sa);
	}
}
