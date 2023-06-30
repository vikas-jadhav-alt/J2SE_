package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.Stack;

public class Test04_Stack{
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