class static_out {
	static int x;
	static int y;

	void add(int a, int b) {
		x = a + b; // 5 //7
		y = x + b; // 8 //9
	}
}

class static_use {
	public static void main(String args[])
        {
            static_out obj1 = new static_out();
            static_out obj2 = new static_out();   
            int a = 2;
            obj1.add(a, a + 1);  //2,3
            obj2.add(5, a); //5,2
            System.out.println(obj1.x + ""+"" + obj2.y);     
        }
}
