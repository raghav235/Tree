package levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level Order Traversal for a Tree
 * @author Raghav
 *
 */
public class LevelOrderTraversalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(21);
		root.right = new Node(19);

		root.left.right = new Node(15);

		root.right.left = new Node(-6);
		root.right.right = new Node(0);

		root.left.right.left = new Node(18);

		root.right.left.right = new Node(17);

		root.right.right.right = new Node(12);

		levelOrderTraversal(root);

	}

	/**
	 * method to print tree in level order.
	 * 
	 * @param root
	 */
	public static void levelOrderTraversal(Node root) {

		if (root == null)
			return;

		Queue<Node> q = new LinkedList<Node>();
		// add root to queue
		q.add(root);
		while (!q.isEmpty()) {
			//pop the queue and print , add the left and right children of popped node to queue.
			root = q.poll();
			System.out.print("  " + root.data);
			// add route's left and right to queue.
			if (root.left != null) {
				q.add(root.left);
			}
			if (root.right != null) {
				q.add(root.right);
			}
		}
	}
}
