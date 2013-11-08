package LeetCode;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/28/2013
 * passed all test cases
 * 
 * mine is O(n^2) see tuzi's solution for O(n)
 * 
 */
public class Longest_Substring_Without_Repeating {
	public int lengthOfLongestSubstring(String s) {

		if (s.length() == 0) {
			return 0;
		}

		int max = 0;
		int length = 0;
		HashMap<Character, Integer> letter = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!letter.containsKey(s.charAt(i))) {
				length++;
				letter.put(s.charAt(i), i);
			} else {
				length = 1;
				i = letter.get(s.charAt(i)) + 1;
				letter.clear();
				letter.put(s.charAt(i), i);
			}

			if (length > max) {
				max = length;
			}

		}

		return max;

	}
}
