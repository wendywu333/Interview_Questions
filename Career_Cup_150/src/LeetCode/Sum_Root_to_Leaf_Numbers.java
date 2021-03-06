/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/4/2013
 * passes all test cases
 * 
 */
public class Sum_Root_to_Leaf_Numbers {

	public int sumNumbers(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return dfs(root, 0);
	}

	public int dfs(TreeNode node, int sum) {
		if (node == null)
			return 0;
		int res = node.val + sum * 10;
		if (node.left == null && node.right == null)
			return res;
		return dfs(node.left, res) + dfs(node.right, res);
	}
}
