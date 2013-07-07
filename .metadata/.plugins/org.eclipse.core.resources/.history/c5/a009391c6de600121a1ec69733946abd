/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Wenzhe
 * @date Jul 5, 2013
 * 
 */
public class Combination_Sum {

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> can = new ArrayList<Integer>();
		for (int i = 0; i < candidates.length; i++) {
			can.add(candidates[i]);
		}
		Collections.sort(can);

		if (target < can.get(0))
			return res;

		ArrayList<Integer> aRes = new ArrayList<Integer>();
		backtracking(res, aRes, can, 0, target);

		return res;

	}

	private boolean backtracking(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> aRes, ArrayList<Integer> can, int start,
			int target) {
		// TODO Auto-generated method stub
		if (target == 0) {
			res.add(new ArrayList<Integer>(aRes));
			return false;
		}

		for (int i = 0; i <= target / can.get(start); i++) {

		}

		return true;

	}
}
