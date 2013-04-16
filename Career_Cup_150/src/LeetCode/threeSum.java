/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wenzhe
 * @date 4/6/2013
 * passes all test cases
 * 
 */
public class threeSum {

	public ArrayList<ArrayList<Integer>> three_Sum(int[] num) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (num.length < 3)
			return res;

		Arrays.sort(num);

		for (int i = 0; i < num.length - 2; i++) {
			if (i == 0 || num[i] != num[i - 1]) {
				int sum = 0 - num[i];
				int j = i + 1;
				int k = num.length - 1;
				while (j < k) {

					if (num[j] + num[k] == sum) {

						ArrayList<Integer> solution = new ArrayList<Integer>();
						solution.add(num[i]);
						solution.add(num[j]);
						solution.add(num[k]);
						res.add(solution);

						j++;
						k--;

						while (j < k && num[j] == num[j - 1]) {
							j++;
						}
						while (k > j && num[k] == num[k + 1]) {
							k--;
						}

					} else if (num[j] + num[k] > sum) {
						k--;
					} else {
						j++;
					}

				}
			}

		}

		return res;

	}

}
