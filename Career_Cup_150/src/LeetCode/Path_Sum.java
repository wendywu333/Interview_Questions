/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/3/2013
 * passed all test cases
 * 
 */
public class Path_Sum {
	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;

		if (root.val == sum && root.left == null && root.right == null) {
			return true;
		}

		if (root.val != sum && root.left == null && root.right == null) {
			return false;
		}

		if (hasPathSum(root.right, sum - root.val))
			return true;
		if (hasPathSum(root.left, sum - root.val))
			return true;

		return false;

	}
}
