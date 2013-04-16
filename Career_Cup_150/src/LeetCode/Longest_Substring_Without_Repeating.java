package LeetCode;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/28/2013
 * passed all test cases
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
