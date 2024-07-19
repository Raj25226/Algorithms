package com.rj.generic.stack;

public class Stack<T> {
	
	private Node<T> top;
	
	public void push(T val) {
		
		Node<T> newNode = new Node<T>(val, top);
		
		top = newNode;
	}
	
	public T pop() {
		
		if(top == null) {
			return null;
		}
		
		Node<T> temp = top;
		
		top = top.getNext();
		
		return temp.getData();
	}
	
	public T peek() {
		
		return top == null ? null : top.getData();
	}
}
