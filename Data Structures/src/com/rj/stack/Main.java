package com.rj.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.push(7);
		stack.push(9);
		
		System.out.println("Peeked: " + stack.peek());
		
		System.out.println("Popped: " + stack.pop());
		
		System.out.println("Peeked: " + stack.peek());

	}

}
