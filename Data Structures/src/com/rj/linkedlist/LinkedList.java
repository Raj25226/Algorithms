package com.rj.linkedlist;

public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node insert(int val) {
		
		Node newNode = new Node(val, null);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node temp = head;
		
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		
		return head;
		
	}
	
	public Node find(int val) {
		
		Node temp = head;
		
		while(temp != null) {
			if(temp.getData() == val) {
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public Node delete(int val) {
		
		if(head.getData() == val) {
			head=head.getNext();
			return head;
		}
		
		Node prev = head;
		Node curr = head.getNext();
		
		while(curr != null) {
			if(curr.getData() == val) {
				prev.setNext(curr.getNext());
				curr.setNext(null);
			}
			prev = curr;
			curr = curr.getNext();
		}
		
		return head;
	}

	public String toString() {
		
		String list = "";
		Node temp = head;
		
		while(temp != null) {
			list += temp.getData();
			if(temp.getNext() != null) {
				list += " -> ";
			}
			temp = temp.getNext();
		}
		
		return list;
	}
	
}
