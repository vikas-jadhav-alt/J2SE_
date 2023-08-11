package practice.eight;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {

		/** Getting Empty Value */
		Optional<Object> empty = Optional.empty();

		String country = "CANADA";
		String nullState = null;

		/** Creating Optional Object */
		Optional<String> ans = Optional.of("Question-Answer");
		Optional<String> s1 = Optional.of(country);
//		Optional<String> s2 = Optional.of(nullState); //RTE:NPE

		Optional<String> s3 = Optional.ofNullable(nullState);

		/** Retrieving Optional Value */
		System.out.println(empty); // Optional.empty
		System.out.println(s1); // Optional[CANADA]

//		s3.get(); //RTE:NPE

		if (s3.isPresent()) {
			System.out.println("S3 Is Present");
		}
		if (s3.isEmpty()) {
			System.out.println("S3 Is Empty"); // S3 Is Empty
		}

		if (s1.isPresent()) {
			System.out.println(s1.get()); // CANADA
		}

		/** Other Methods */
		System.out.println(s3.orElse("LONDON")); // LONDON

		s1.ifPresent((s) -> System.out.println("This is my " + s)); // This is my CANADA

		s3.ifPresentOrElse((s) -> System.out.println("This is my " + s), () -> System.out.println("This is NOTHING")); // This
																														// is
																														// NOTHING

	}

}
