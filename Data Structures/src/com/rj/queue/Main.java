package com.rj.queue;

public class Main {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println(queue.peek());
	}

}
