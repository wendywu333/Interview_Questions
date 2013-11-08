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
public class Flatten_Binary_Tree_to_Linked_List {

	public void flatten(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return;

		TreeNode cur = root;
		TreeNode tail;
		TreeNode temp;

		while (cur.left != null || cur.right != null) {

			if (cur.left == null) {
				cur = cur.right;
				continue;
			}
			if (cur.right == null) {
				cur.right = cur.left;
				cur.left = null;
				cur = cur.right;
				continue;
			}

			tail = cur.left;
			while (tail.right != null) {
				tail = tail.right;
			}

			temp = cur.right;
			cur.right = cur.left;
			tail.right = temp;
			cur.left = null;

			cur = cur.right;

		}

	}

}
