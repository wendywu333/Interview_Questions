/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/26/2013
 * 
 * passed all tests
 * 
 */
public class Interleaving_String {

	public boolean isInterleave(String s1, String s2, String s3) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (s1.length() + s2.length() != s3.length())
			return false;
		if (s1.length() == 0 || s2.length() == 0) {
			if (s3.equals(s1) || s3.equals(s2))
				return true;
			else
				return false;
		}
		// initialize the array
		// check if the first i character in s1 and first j character in s2 form
		// the first i+j substring of s3
		boolean[][] match = new boolean[s1.length() + 1][s2.length() + 1];
		match[0][0] = true;
		if (s3.charAt(0) == s1.charAt(0))
			match[1][0] = true;
		for (int i = 2; i < s1.length() + 1; i++) {
			match[i][0] = match[i - 1][0]
					&& (s3.charAt(i - 1) == s1.charAt(i - 1));
		}

		if (s3.charAt(0) == s2.charAt(0))
			match[0][1] = true;
		for (int i = 2; i < s2.length() + 1; i++) {
			match[0][i] = match[0][i - 1]
					&& (s3.charAt(i - 1) == s2.charAt(i - 1));
		}

		for (int i = 1; i < s1.length() + 1; i++) {

			for (int j = 1; j < s2.length() + 1; j++) {

				if ((match[i - 1][j] && s3.charAt(i + j - 1) == s1
						.charAt(i - 1))
						|| (match[i][j - 1] && s3.charAt(i + j - 1) == s2
								.charAt(j - 1))) {
					match[i][j] = true;
				}

			}

		}

		return match[s1.length()][s2.length()];

	}
	
	
	public static void main(String args[]){
		Interleaving_String o = new Interleaving_String();
		String s1 = "aabccabc";
		String s2 = "dbbabc";
		String s3 = "aabdbbccababcc";
		System.out.println(o.isInterleave(s1, s2, s3));
		}

}
