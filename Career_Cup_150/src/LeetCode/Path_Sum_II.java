/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date 7/11/2013
 * 
 * passed all tests
 */
public class Path_Sum_II {

	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> aRes = new ArrayList<Integer>();
		pathS(root, sum, aRes, res);
		return res;

	}

	private void pathS(TreeNode root, int sum, ArrayList<Integer> aRes, ArrayList<ArrayList<Integer>> res) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			if (sum == root.val) {
				aRes.add(root.val);
				res.add(new ArrayList<Integer>(aRes));
			}
			return;
		}

		ArrayList<Integer> le = new ArrayList<Integer>(aRes);
		le.add(root.val);
		pathS(root.left, sum - root.val, le, res);

		ArrayList<Integer> rt = new ArrayList<Integer>(aRes);
		rt.add(root.val);
		pathS(root.right, sum - root.val, rt, res);

	}

	public static void main(String args[]) {
		Path_Sum_II o = new Path_Sum_II();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		o.pathSum(root, 0);
	}

}
