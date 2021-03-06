/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Wenzhe
 * @date Jul 1, 2013
 * 
 * passed all tests
 * 
 */
public class Binary_Tree_Inorder_Traversal {

	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;

		Stack<TreeNode> s = new Stack<TreeNode>();
		while (root != null) {
			s.push(root);
			root = root.left;
		}

		while (s.size() > 0) {
			root = (TreeNode) s.pop();
			res.add(root.val);

			if (root.right != null) {
				root = root.right;
				while (root != null) {
					s.push(root);
					root = root.left;
				}
			}
		}

		return res;

	}

}
