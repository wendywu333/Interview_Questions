package LeetCode;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/30/2013 passed all test cases
 * 
 */
public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (q == null && p == null)
			return true;
		if ((q == null && p != null) || (p == null && q != null)) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		boolean a = isSameTree(p.left, q.left);
		boolean b = isSameTree(p.right, q.right);

		return (true & a & b);
	}

}
