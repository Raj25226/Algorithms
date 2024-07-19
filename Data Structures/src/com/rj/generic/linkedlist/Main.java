package com.rj.generic.linkedlist;



public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.insert("A");
		list.insert("B");
		list.insert("C");
		list.insert("D");
		list.insert("E");
		list.insert("F");
		list.insert("G");
		list.insert("H");
		list.insert("I");
		list.insert("J");
		
		System.out.println(list.toString());
		
		Node<String> found = list.find("B");
		
		if(found != null) {
			System.out.println("List after searched element: " + found.toString());
		}else {
			System.out.println("Does not exists.");
		}
		
		System.out.println("New List: " + list.delete("G").toString());
		
	}
}
