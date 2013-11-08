/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Wenzhe
 * @date Jul 12, 2013
 * 
 * passed all tests
 */
public class Binary_Tree_Level_Order_Traversal_II {

	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		LinkedList<TreeNode> a = new LinkedList<TreeNode>();
		LinkedList<TreeNode> b = new LinkedList<TreeNode>();
		TreeNode temp;
		a.add(root);
		while (a.size() != 0 || b.size() != 0) {
			if (a.size() != 0) {
				ArrayList<Integer> aRes = new ArrayList<Integer>();
				while (a.size() != 0) {
					temp = a.remove();
					aRes.add(temp.val);
					if (temp.left != null)
						b.add(temp.left);
					if (temp.right != null)
						b.add(temp.right);
				}
				res.add(aRes);
			}

			if (b.size() != 0) {
				ArrayList<Integer> aRes = new ArrayList<Integer>();
				while (b.size() != 0) {
					temp = b.remove();
					aRes.add(temp.val);
					if (temp.left != null)
						a.add(temp.left);
					if (temp.right != null)
						a.add(temp.right);
				}
				res.add(aRes);
			}
		}

		ArrayList<Integer> temp2;
		int i = 0;
		int j = res.size() - 1;

		while (i <= j) {
			temp2 = res.get(i);
			res.set(i, res.get(j));
			res.set(j, temp2);
			i++;
			j--;
		}

		return res;

	}

}
