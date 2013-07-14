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
		// Start typing your Java solution below
		// DO NOT write main() function
		int n = A.length;
		int[] a = new int[n];
		for (int i = 1; i < n; i++) {
			a[i] = Integer.MAX_VALUE;
		}
		a[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= A[i]; j++) {
				if (i + j < n) {
					a[i + j] = a[i + j] < a[i] + 1 ? a[i + j] : a[i] + 1;
				} else {
					break;
				}
			}
		}
		return a[n - 1];
	}
}
