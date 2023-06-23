
public class NITTable {
	private Object[] keysArray;
	private Object[] valuesArray;
	
	public NITTable(){
		keysArray = new Object[10];
	}
	
	public void add(Object s) {
		keysArray[0] = s;
	}
	
	public Object get(int sno) {
		return keysArray[0];
	}
	
	public void replace(Object s) {
		keysArray[0] = s;
	}
	
	public void remove(Object s) {
		//-------------
	}
	
	public boolean search(Object s) {
		//-------------
		return true;
	}
	
	public void sort() {
		//-----------
	}

}
