//PropertiesDemo.java
import java.io.*;
import java.util.*;

public class PropertiesDemo 
{
	public static void main(String[] args)  throws Exception
	{
		Properties p = new Properties();
		p.load(new FileInputStream(args[0]));
		
		System.out.println("eid:"+p.getProperty("eid"));
		System.out.println("name:"+p.getProperty("ename"));
		System.out.println("desig:"+p.getProperty("desig"));
		System.out.println("company:"+p.getProperty("company"));

		System.out.println("abc:"+p.getProperty("abc"));
		System.out.println("abc:"+p.getProperty("abc","abc key is not found"));
		
		p.setProperty("exp","Since 2004");
		Enumeration e	= p.propertyNames();
		
		while(e.hasMoreElements()){
			System.out.println(p.getProperty((String)e.nextElement()));
		}
		
		p.list(new PrintStream(new FileOutputStream("List Result.properties")));
		p.store(new PrintStream(new FileOutputStream("Store Result.properties")),"Emp details");
		
	}
}
