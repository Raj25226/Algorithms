package com.rj.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(3);
		list.insert(5);
		list.insert(2);
		list.insert(9);
		list.insert(4);
		list.insert(7);
		list.insert(6);
		list.insert(8);
		list.insert(2);
		list.insert(1);
		
		System.out.println(list.toString());
		
		Node found = list.find(3);
		
		if(found != null) {
			System.out.println("List after searched element: " + found.toString());
		}else {
			System.out.println("Does not exists.");
		}
		
		System.out.println("New List: " + list.delete(5).toString());
		
	}

}
