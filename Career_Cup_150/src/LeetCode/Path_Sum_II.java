/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date 4/3/2013 To be solved by backtracking!!!
 * 
 */
public class Path_Sum_II {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {

		ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return solution;

		TreeNode origin = root;

		ArrayList<Integer> solution1 = new ArrayList<Integer>();
		int realsum = 0;
		checkResult(root, realsum, sum, solution, origin, solution1);

		return solution;

	}

	private boolean checkResult(TreeNode root, int realsum, int sum,
			ArrayList<ArrayList<Integer>> solution, TreeNode original,
			ArrayList<Integer> solution1) {
		// TODO Auto-generated method stub

		solution1.add(root.val);
		realsum += root.val;
		if (realsum == sum && root.left == null && root.right == null) {

			solution.add(solution1);
			ArrayList<Integer> solution2 = new ArrayList<Integer>();
			solution1 = new ArrayList<Integer>(solution2);
			return true;

		} else {

			if (root.left != null) {

				checkResult(root.left, realsum, sum, solution, original,
						solution1);
				solution1.remove(solution1.size() - 1);
				realsum = realsum - root.val;
			}
			if (root.right != null) {
				checkResult(root.right, realsum, sum, solution, original,
						solution1);
				solution1.remove(solution1.size() - 1);
				realsum = realsum - root.val;
			}

		}

		return false;
	}
}
