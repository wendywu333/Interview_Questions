/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/3/2013
 * 
 */
public class Maximum_Depth_of_Binary_Tree {

	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

	}

}
