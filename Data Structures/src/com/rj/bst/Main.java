package com.rj.bst;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(4);
		bst.insert(6);
		
		System.out.println(bst.toString());
		
	}

}
