package com.rj.generic.linkedlist;

import com.rj.generic.linkedlist.Node;

public class LinkedList<T> {
	
	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public Node<T> insert(T val) {
		
		Node<T> newNode = new Node<>(val, null);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node<T> temp = head;
		
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		
		return head;
		
	}
	
	public Node<T> find(T val) {
		
		Node<T> temp = head;
		
		while(temp != null) {
			if(temp.getData().equals(val)) {
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public Node<T> delete(T val) {
		
		if(head.getData().equals(val)) {
			head=head.getNext();
			return head;
		}
		
		Node<T> prev = head;
		Node<T> curr = head.getNext();
		
		while(curr != null) {
			if(curr.getData().equals(val)) {
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
		Node<T> temp = head;
		
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
