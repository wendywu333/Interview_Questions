/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jun 30, 2013
 * 
 * passed all tests
 * 
 */
public class Minimum_Depth_of_Binary_Tree {

	public int minDepth(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);

		if (left == 0 && right == 0)
			return 1;
		else if (left == 0)
			return right + 1;
		else if (right == 0)
			return left + 1;
		else
			return Math.min(left, right) + 1;

	}

}
