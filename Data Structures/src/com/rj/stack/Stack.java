package com.rj.stack;

public class Stack {
	
	private Node top;
	
	public void push(int val) {
		
		Node newNode = new Node(val, top);
		
		top = newNode;
	}
	
	public int pop() {
		
		if(top == null) {
			return -1;
		}
		
		Node temp = top;
		
		top = top.getNext();
		
		return temp.getData();
	}
	
	public int peek() {
		
		return top == null ? null : top.getData();
	}
}
