/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 4, 2013
 * 
 * passed all tests
 * 
 */
public class Palindrome_Partitioning_II {

	public int minCut(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (s == null || s.length() == 0)
			return 0;

		int n = s.length();
		boolean a[][] = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			a[i][i] = true;
			if (i != n - 1) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					a[i][i + 1] = true;
				}
			}
		}
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;
				if (s.charAt(j) == s.charAt(i) && a[i + 1][j - 1])
					a[i][j] = true;
			}
		}

		int[] min = new int[n + 1];
		min[0] = 0;
		min[1] = 1;

		for (int i = 2; i <= n; i++) {

			int minCut = Integer.MAX_VALUE;

			for (int j = i; j >= 1; j--) {
				if (a[j - 1][i - 1] == true && (min[j - 1] + 1 < minCut)) {
					minCut = min[j - 1] + 1;
				}
			}

			min[i] = minCut;

		}

		return min[n] - 1;
	}

}

// public class Palindrome_Partitioning_II {
//
// public int minCut(String s) {
// // Start typing your Java solution below
// // DO NOT write main() function
//
// if (s == null || s.length() == 0)
// return 0;
//
// int n = s.length();
// boolean a[][] = new boolean[n][n];
// for (int i = 0; i < n; i++) {
// a[i][i] = true;
// if (i != n - 1) {
// if (s.charAt(i) == s.charAt(i + 1)) {
// a[i][i + 1] = true;
// }
// }
// }
// for (int len = 3; len <= n; len++) {
// for (int i = 0; i <= n - len; i++) {
// int j = i + len - 1;
// if (s.charAt(j) == s.charAt(i) && a[i + 1][j - 1])
// a[i][j] = true;
// }
// }
// int[] min = new int[1];
// min[0] = Integer.MAX_VALUE;
// int cut = 0;
//
// backTracking(s, a, min, cut, 0, n);
//
// return min[0] - 1;
// }
//
// private boolean backTracking(String s, boolean[][] a, int[] min, int cut,
// int cur, int len) {
//
// if (cur == len) {
// if (cut < min[0])
// min[0] = cut;
// return false;
// }
// for (int j = cur; j < len; j++) {
// if (a[cur][j] == true) {
// cut++;
// boolean b = backTracking(s, a, min, cut, j + 1, len);
// if (!b) {
// cut--;
// }
// }
// }
// return false;
//
// }
//
// }