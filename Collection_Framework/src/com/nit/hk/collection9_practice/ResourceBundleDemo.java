import java.util.*;

class ResourceBundleDemo  {
	public static void main(String[] args) 	{

		//loaded properties file based on current locale
		ResourceBundle rb	= 
			ResourceBundle.getBundle("wish");

		//loaded properties file based on passed Locale
		//ResourceBundle rb	= ResourceBundle.getBundle("wish", new Locale(Locale.FRENCH.toString(),  Locale.FRENCH.toString()));

		String wish	= rb.getString("hellowish");
		System.out.println(wish);
	}
}
