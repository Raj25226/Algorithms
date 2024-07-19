package com.rj.bst;

public class BinarySearchTree {
	
	Node root;
	
	public Node insert(int data) {
		
		Node newNode = new Node(data, null, null);
		
		if(root == null) {
			root = newNode;
		} else {
		
			Node temp = root;
			
			while (temp != null) {
				if(temp.getData() < data) {
					if(temp.getRight() == null) {
						temp.setRight(newNode);
						return root; 
					}
					temp = temp.getRight();
				} else {
					if(temp.getLeft() == null) {
						temp.setLeft(newNode);
						return root; 
					}
					temp = temp.getLeft();
				}
			}
		}

		return root;
	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	
	
	
}
