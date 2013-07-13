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
public class Subsets_II {

	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		if (num == null || num.length == 0)
			return res;
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {

			ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> al : res) {
				ArrayList<Integer> temp = new ArrayList<Integer>(al);
				temp.add(num[i]);
				if (!cur.contains(temp)) {
					cur.add(temp);
				}
				ArrayList<Integer> temp2 = new ArrayList<Integer>(al);
				cur.add(temp2);
			}
			res = new ArrayList<ArrayList<Integer>>(cur);

		}

		return res;

	}

	public static void main(String args[]) {
		Subsets_II o = new Subsets_II();
		o.subsetsWithDup(new int[] { -1, 1, 2 });

	}
}
