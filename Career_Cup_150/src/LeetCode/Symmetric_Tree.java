/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 2, 2013
 * 
 * passed all tests
 * 
 */
public class Symmetric_Tree {

	public boolean isSymmetric(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (root == null)
			return true;

		return isTwoSide(root.left, root.right);

	}

	private boolean isTwoSide(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;

		if (left.val == right.val) {

			return isTwoSide(left.left, right.right)
					&& isTwoSide(left.right, right.left);

		} else {
			return false;
		}

	}

}
