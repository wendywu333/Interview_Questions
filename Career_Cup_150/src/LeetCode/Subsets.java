/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wenzhe
 * @date Jul 12, 2013
 * 
 * passed all tests
 */
public class Subsets {

	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		if (S == null || S.length == 0)
			return res;
		Arrays.sort(S);
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> al : res) {
				ArrayList<Integer> temp = new ArrayList<Integer>(al);
				temp.add(S[i]);
				cur.add(temp);
				ArrayList<Integer> temp2 = new ArrayList<Integer>(al);
				cur.add(temp2);
			}
			res = new ArrayList<ArrayList<Integer>>(cur);
		}

		return res;

	}

}
