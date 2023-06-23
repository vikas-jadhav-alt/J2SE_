
public class MyArrayList {
	
	private Object[] elementData;
	private int elememtCount;
	
	public MyArrayList() {
		elementData = new Object[10];
	}
	public MyArrayList(int initialCapacity) {
		if(initialCapacity <0) 
			throw new IllegalArgumentException(""+initialCapacity); 
		
		elementData = new Object[initialCapacity];
	}
}
