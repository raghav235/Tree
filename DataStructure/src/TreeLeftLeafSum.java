package com.oracle.tree;

/*
 * A node is leaf if it's left and right child is null
 * A node is Left leaf , if parentNode.left==currentNode
*/

class TreeLeftLeafSum {
	
	public static void main(String[] args) {

		Node root = getBinaryTree();
		int sum = getLeftLeafSum(root, null);
		System.out.println("Total Sum: " + sum);

	}

	public static int getLeftLeafSum(Node root, Node parent) {

		if (root == null)
			return 0;
		if (parent != null && parent.left == root && root.left == null && root.right == null) {
			System.out.println("Found Left Leaf " + root.data);
			return root.data;
		}

		int left = getLeftLeafSum(root.left, root);
		int right = getLeftLeafSum(root.right, root);

		return left + right;
	}

	public static Node getBinaryTree() {

		Node root = new Node(10);
		root.left = new Node(21);
		root.right = new Node(19);

		root.left.left = new Node(15);
		root.left.right = new Node(17);

		root.right.left = new Node(9);
		root.right.right = new Node(50);
		
		root.right.right.left = new Node(10);

		return root;
	}
}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}
