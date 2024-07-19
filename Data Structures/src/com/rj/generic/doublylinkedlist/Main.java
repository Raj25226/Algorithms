package com.rj.generic.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(0);
		
		System.out.println(list.toString());
		
		System.out.println(list.find(3));
		
		System.out.println(list.remove(2));
		
		System.out.println(list.toString());
		
	}

}
