/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 7, 2013
 * 
 * passed all tests
 */
public class Length_of_Last_Word {

	public int lengthOfLastWord(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (s == null || s.length() == 0)
			return 0;
		int res = 0;
		int i = s.length() - 1;

		while (s.charAt(i) == ' ') {
			i--;
			if (i == -1)
				return res;
		}
		while (s.charAt(i) != ' ') {
			i--;
			res++;
			if (i == -1)
				return res;
		}
		return res;

	}

}
