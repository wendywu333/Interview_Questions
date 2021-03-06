/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jun 30, 2013
 * 
 * passes all tests
 * 
 */
public class Validate_Binary_Search_Tree {

	public boolean isValidBST(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function

		return isValidBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private boolean isValidBST2(TreeNode root, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if (root == null)
			return true;
		boolean left = true, right = true;
		if (root.left != null) {
			left = (root.left.val < root.val) && (root.left.val > minValue)
					&& isValidBST2(root.left, minValue, root.val);
		}

		if (root.right != null) {
			right = (root.right.val > root.val) && (root.right.val < maxValue)
					&& isValidBST2(root.right, root.val, maxValue);
		}

		return (left && right);

	}
}
