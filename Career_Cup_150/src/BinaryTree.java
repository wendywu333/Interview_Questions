/**
 * @(#)BinaryTree.java
 * 
 * 
 * @author
 * @version 1.00 2009/4/12
 */

class BinaryTree<T> {
	private BinaryTreeNode<T> root;

	public BinaryTree() {
		root = null;
	}

	public void inorder() {
		inorderHelper(root);
		System.out.println("");
	}

	// Inorder traversal - recursive
	private void inorderHelper(BinaryTreeNode<T> nd) {
		if (nd != null) {
			inorderHelper(nd.getLRef());
			System.out.println(nd.getData());
			inorderHelper(nd.getRRef());
		}
	}

	// Add (insert) node, binary search tree
	public void insert(T value) {
		if (!(value instanceof Comparable)) {
			System.out
					.println("Major Error! Tree is not made of comparable type!");
			return;
		}
		BinaryTreeNode<T> current = null;
		BinaryTreeNode<T> previous = null;
		BinaryTreeNode<T> newNode = null;

		// Create node to store value
		newNode = new BinaryTreeNode<T>();
		newNode.setData(value);

		// Insert according to binary search tree criteria
		if (root == null)
			root = newNode;
		else {
			current = root;
			while (current != null) {
				previous = current;
				if (current.getData().equals(value)) {
					System.out.println("Duplicates not allowed");
					return;
				} else {
					// Note: T Object types must support Comparable<T> interface
					if (((Comparable) current.getData()).compareTo(value) > 0)
						current = current.getLRef();
					else
						current = current.getRRef();
				}
			}
			if (((Comparable) previous.getData()).compareTo(value) > 0)
				previous.setLRef(newNode);
			else
				previous.setRRef(newNode);
		}
	}
}
