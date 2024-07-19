package com.rj.queue;

import com.rj.generic.queue.Node;

public class Queue {
	
	private Node head;
	private Node tail;
	
	public void add(int val) {
		
		Node newNode = new Node(val, null);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
	}
	
	public Node remove() {
		if(head == null) {
			return null;
		}
		
		Node temp = head;
		
		if(tail == head) {
			tail = null;
		}
		
		head = head.getNext();
		temp.setNext(null);
		
		return temp;
	}
	
	public Node peek() {
		
		return head;
	}
}
