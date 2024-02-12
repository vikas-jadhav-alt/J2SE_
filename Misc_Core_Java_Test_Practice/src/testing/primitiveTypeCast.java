package testing;

/**If Assigned value is in range then: no CTE */
/**
 * If it is out of range then we get CTE and in that case we requires to do type
 * casting
 */

public class primitiveTypeCast {

	public static void main(String[] args) {

		// byte range = -128 to 127

		byte b = 2;
		byte h = 127;
		System.out.println(h); // 127

//		byte s = 128; //CTE: Type mismatch: cannot convert from int to byte

		byte y = (byte) 129; // Overflow will happen
		System.out.println(y); // -127

	}

}
