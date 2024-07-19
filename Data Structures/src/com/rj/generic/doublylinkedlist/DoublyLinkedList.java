package com.rj.generic.doublylinkedlist;

public class DoublyLinkedList<T> {
	
	Node<T> head;

	public Node<T> add(T val) {
		
		Node<T> newNode = new Node<T>(val,null,null);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node<T> temp = head;
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		
		temp.getNext().setPrev(temp);
		
		return head;
	}
	
	public Node<T> find(T val) {
		
		Node<T> temp = head;
		
		while(temp.getNext() != null) {
			if(temp.getData().equals(val)) {
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public Node<T> remove(T val) {
		
		Node<T> temp = head;
		
		while(temp != null) {
			
			if(temp.getData().equals(val)) {
				if(temp == head) {
					head = temp.getNext();
					head.setPrev(null);
					temp.setNext(null);
				}else {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
				}
			}
			temp = temp.getNext();

		}
		
		return head;
	}

	@Override
	public String toString() {
		
		String s = "";
		Node<T> temp = head;
		
		while(temp != null) {
			s += temp.getData();
			if(temp.getNext() != null) {
				s += " -> ";
			}
			temp = temp.getNext();
		}
		
		return s;
		
	}
	
	
	
}
