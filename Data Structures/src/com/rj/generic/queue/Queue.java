package com.rj.generic.queue;


public class Queue<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T val) {
		
		Node<T> newNode = new Node<T>(val, null);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
	}
	
	public Node<T> remove() {
		if(head == null) {
			return null;
		}
		
		Node<T> temp = head;
		
		if(tail == head) {
			tail = null;
		}
		
		head = head.getNext();
		temp.setNext(null);
		
		return temp;
	}
	
	public Node<T> peek() {
		
		return head;
	}
}
