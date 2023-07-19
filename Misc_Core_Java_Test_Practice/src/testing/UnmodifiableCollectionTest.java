package testing;
import java.util.List;

public class UnmodifiableCollectionTest {

	public static void main(String[] args) {

		System.out.println("Starting");

		List<Object> of = List.of(true, 5, 7, null); // Runtime Error

		System.out.println(of);

	}
}
