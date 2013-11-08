/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wenzhe
 * @date Jul 6, 2013
 * 
 * passed all tests
 * 
 */
public class Combination_Sum {

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(candidates);

		return recuCombSum(candidates, target, 0, res);
	}

	private ArrayList<ArrayList<Integer>> recuCombSum(int[] can, int target,
			int i, ArrayList<ArrayList<Integer>> prev) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		if (target == 0) {
			for (ArrayList<Integer> temp : prev) {
				ArrayList<Integer> temp1 = new ArrayList<Integer>(temp);
				res.add(temp1);
			}
			return res;
		}

		for (int j = i; j < can.length; j++) {
			if (can[j] > target)
				break;
			for (ArrayList<Integer> temp : prev) {
				temp.add(can[j]);
			}
			ArrayList<ArrayList<Integer>> next = recuCombSum(can, target
					- can[j], j, prev);
			if (next.size() > 0) {
				res.addAll(next);
			}
			for (ArrayList<Integer> temp : prev)
				temp.remove(temp.size() - 1);

		}

		return res;
	}

	public static void main(String args[]) {
		Combination_Sum o = new Combination_Sum();
		o.combinationSum(new int[] { 1, 2 }, 2);
	}
}
