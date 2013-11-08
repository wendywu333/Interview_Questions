/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date Jul 8, 2013
 * 
 * passed all tests
 * not optimized
 * 
 */
public class Permutations {

	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++) {
			ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> temp : res) {
				for (int j = 0; j < num.length; j++) {
					if (!temp.contains(num[j])) {
						ArrayList<Integer> a = new ArrayList<Integer>(temp);
						a.add(num[j]);
						cur.add(a);
					}
				}
			}
			res = new ArrayList<ArrayList<Integer>>(cur);
		}
		return res;
	}
}
