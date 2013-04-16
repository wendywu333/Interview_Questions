/**
 * 
 */
package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Wenzhe
 * @date 4/6/2013
 * passes all test cases
 * 
 */
public class Longest_Consecutive_Sequence {

	public int longestConsecutive(int[] num) {

		if (num.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : num) {
			set.add(a);
		}

		HashMap<Integer, Integer> start = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> end = new HashMap<Integer, Integer>();

		for (int a : set) {
			if (start.containsKey(a + 1) && end.containsKey(a - 1)) {

				start.put(a - end.get(a - 1), end.get(a - 1) + start.get(a + 1)
						+ 1);
				end.put(a + start.get(a + 1), end.get(a - 1) + start.get(a + 1)
						+ 1);
				start.remove(a + 1);
				end.remove(a - 1);

			} else if (start.containsKey(a + 1)) {

				start.put(a, start.get(a + 1) + 1);
				end.remove(a + start.get(a + 1));
				end.put(a + start.get(a + 1), start.get(a + 1) + 1);
				start.remove(a + 1);

			} else if (end.containsKey(a - 1)) {

				end.put(a, end.get(a - 1) + 1);
				start.remove(a - end.get(a - 1));
				start.put(a - end.get(a - 1), end.get(a - 1) + 1);
				end.remove(a - 1);

			} else {
				start.put(a, 1);
				end.put(a, 1);
			}
		}

		int max = 0;
		for (int q : end.values()) {
			max = Math.max(q, max);
		}

		return max;
	}

}
