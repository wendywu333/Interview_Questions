/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/1/2013
 * passed all test cases
 * 
 */
public class Longest_Palindromic_Substring {

	public String longestPalindrome(String s) {

		if (s.length() <= 1) {
			return s;
		}

		int length = s.length();
		int maxlength = 1;
		int longestbegin = 0;
		// first index is start index, second index is the end index
		boolean[][] status = new boolean[length][length];
		// System.out.println(status[1][1]);
		for (int i = 0; i < length; i++) {
			status[i][i] = true;
			longestbegin = i;
		}

		for (int i = 0; i < length - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				maxlength = 2;
				status[i][i + 1] = true;
				longestbegin = i;
			}
		}

		for (int len = 3; len <= length; len++) {
			for (int i = 0; i < length - len + 1; i++) {
				int j = i + len - 1;
				if (s.charAt(j) == s.charAt(i) && status[i + 1][j - 1]) {
					maxlength = len;
					status[i][j] = true;
					longestbegin = i;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = longestbegin; i < longestbegin + maxlength; i++) {
			sb.append(s.charAt(i));
		}

		return sb.toString();

	}

	public static void main(String args[]) {
		Longest_Palindromic_Substring o = new Longest_Palindromic_Substring();
		System.out.println(o.longestPalindrome("ttabbatiamyours" +
				""));
	}

}
