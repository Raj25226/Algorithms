package com.rj.generic.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println("Peeked: " + stack.peek());
		
		System.out.println("Popped: " + stack.pop());
		
		System.out.println("Peeked: " + stack.peek());

	}

}
