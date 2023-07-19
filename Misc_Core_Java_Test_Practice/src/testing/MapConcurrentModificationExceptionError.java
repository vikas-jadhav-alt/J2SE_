package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class StreamDemo {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(5);
		num.add(3);
		num.add(9);
		num.add(4);
		num.add(7);

		System.out.println("List: " + num);

		/** But MAP With Next Modified */
		List<Integer> result = num.stream().map(ele -> {

			System.out.println("-------------------------------");

			int index = num.indexOf(ele);

			System.out.println("Before List: " + num + " Index: " + index + " Element :" + ele);
			if (index >= 0)
				num.remove(index);
			System.out.println("After List: " + num);

			if (Objects.isNull(ele))
				return -1;
			else
				return ele * 3; // Taking The 'i', not modified one

		}).collect(Collectors.toList());
		System.out.println("Result: " + result);

		/** See: Modified Now */
		System.out.println("List: " + num);

	}

}
