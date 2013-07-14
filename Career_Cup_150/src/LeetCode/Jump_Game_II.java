/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 13, 2013
 * 
 */
public class Jump_Game_II {

	public int jump(int[] A) {
		/*
		 * We use "last" to keep track of the maximum distance that has been
		 * reached by using the minimum steps "ret", whereas "cur" is the
		 * maximum distance that can be reached by using "ret+1" steps. Thus,
		 * cur = max(i+A[i]) where 0 <= i <= last.
		 */

		int last = 0, cur = 0, ret = 0;

		for (int i = 0; i < A.length; i++) {
			if (i > last) {
				last = cur;
				ret++;
			}
			cur = Math.max(cur, i + A[i]);
		}

		return ret;
	}

	// public int jump(int[] A) {
	// // Start typing your Java solution below
	// // DO NOT write main() function
	// int n = A.length;
	// int[] a = new int[n];
	// for (int i = 1; i < n; i++) {
	// a[i] = Integer.MAX_VALUE;
	// }
	// a[0] = 0;
	// for (int i = 0; i < n; i++) {
	// for (int j = 1; j <= A[i]; j++) {
	// if (i + j < n) {
	// a[i + j] = a[i + j] < a[i] + 1 ? a[i + j] : a[i] + 1;
	// } else {
	// break;
	// }
	// }
	// }
	// return a[n - 1];
	// }
}
