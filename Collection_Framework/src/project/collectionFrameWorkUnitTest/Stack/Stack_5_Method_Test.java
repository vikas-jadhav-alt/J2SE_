package project.collectionFrameWorkUnitTest.Stack;

import java.util.Stack;

public class Stack_5_Method_Test {
	public static void main(String[] args) {
		Stack<Object> stack = new Stack<>();
		System.out.println(stack.empty());
		System.out.println(stack.size());
		System.out.println();

		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");

		System.out.println(stack.empty());
		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println();

		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search("a"));

		stack.add(5);
		System.out.println(stack);
		System.out.println(stack.get(1));
		System.out.println(stack.remove(2));
		System.out.println(stack);
	}
}

//Output:
//true
//0
//
//false
//5
//[a, b, c, d, e]
//
//e
//[a, b, c, d]
//d
//[a, b, c]
//c
//[a, b, c]
//c
//[a, b, c]
//3
//[a, b, c, 5]
//b
//c
//[a, b, 5]
