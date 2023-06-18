
package annotation.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum ObjType {
	NEW, USED, INTO;
}

//1. creating annotation 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Product {
//attributes 
	int prodId(); // required

	String objName() default "NO";// optional

	ObjType objType() default ObjType.NEW;// optional

	int[] emptyArray() default {}; // Empty Array

	int[] array() default { 5, 7 }; // With Default Values

	// array if Enum
	ObjType[] enumArray(); // Required

	ObjType[] enumArray2() default { ObjType.NEW, ObjType.USED };

	boolean isDone() default false;
}

//2. Processor class for Annotation 
class ProcessorAnnotation {
	public static void process(Class<?> c) {
		Product p = (Product) c.getAnnotation(Product.class);
		if (p == null)
			throw new RuntimeException("No Product Annotation is provided");
		else {
			System.out.println("Having Product Annotation:");
			System.out.println("Id: " + p.prodId());
			System.out.println("NAME:" + p.objName());
			System.out.println("Type:" + p.objType());
			System.out.println("EnumArray:" + p.enumArray());
			System.out.println("IsDone:" + p.isDone());
		}
	}
}

//3. Using annotation 
@Product(prodId = 6, isDone = true, enumArray = {}, objName = "SM", objType = ObjType.USED)
class Smaple {
}

//4.Testing Annotation 
public class Test {
	public static void main(String[] args) {
		ProcessorAnnotation.process(Smaple.class);
	}
}
