/**
 * 
 */
package LeetCode;

import others.Useful_pieces;

/**
 * @author Wenzhe
 * @date 4/6/2013
 * passes all test cases
 * 
 */
public class Balanced_Binary_Tree {

	public boolean isBalanced(TreeNode root) {
		return height(root) != -1;
	}

	private int height(TreeNode root) {
		if (root == null)
			return 0;

		int leftHeight = height(root.left);
		if (leftHeight == -1)
			return -1;

		int rightHeight = height(root.right);
		if (rightHeight == -1)
			return -1;

		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;

		return 1 + Math.max(leftHeight, rightHeight);
	}

	// public boolean isBalanced(TreeNode root) {
	// if (root == null) {
	// return true;
	// }
	//		
	// if(isBalanced(root.left) && isBalanced(root.right)){
	// return (Math.abs(height(root.left) - height(root.right)) <= 1);
	// }
	//		
	// return false;
	//
	// }
	//
	// private int height(TreeNode node) {
	// // TODO Auto-generated method stub
	// if (node == null)
	// return 0;
	// return Math.max(height(node.left), height(node.right)) + 1;
	// }

	public static void main(String args[]) {
		TreeNode root = new TreeNode(0);
		TreeNode origin = root;
		for (int i = 1; i < 5; i++) {
			root.left = new TreeNode(i);
			root = root.left;
		}
		Useful_pieces oo = new Useful_pieces();
		oo.breadth(origin);
		Balanced_Binary_Tree o = new Balanced_Binary_Tree();
		boolean res = o.isBalanced(origin);
		System.out.println(res);

	}

}
