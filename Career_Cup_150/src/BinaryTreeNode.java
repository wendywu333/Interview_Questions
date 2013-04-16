/**
 * @(#)BinaryTreeNode.java
 * 
 * 
 * @author
 * @version 1.00 2009/4/12
 */

class BinaryTreeNode<T> {
	private T data; // data value in node
	private BinaryTreeNode<T> lRef; // reference to left node
	private BinaryTreeNode<T> rRef; // reference to right node

	// Binary tree node constructor
	public BinaryTreeNode() {
		lRef = rRef = null;
	}

	public void setData(T theData) {
		data = theData;
	}

	public T getData() {
		return (data);
	}

	public void setLRef(BinaryTreeNode<T> left) {
		lRef = left;
	}

	public void setRRef(BinaryTreeNode<T> right) {
		rRef = right;
	}

	public BinaryTreeNode<T> getLRef() {
		return (lRef);
	}

	public BinaryTreeNode<T> getRRef() {
		return (rRef);
	}
}