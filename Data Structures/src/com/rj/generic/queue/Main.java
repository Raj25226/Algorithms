package com.rj.generic.queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<>();
		
		queue.add("P");
		queue.add("Q");
		queue.add("R");
		queue.add("S");
		queue.add("T");
		queue.add("U");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println(queue.peek());
		
	}

}
