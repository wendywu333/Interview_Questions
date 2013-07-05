/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 1, 2013
 * 
 * passed all tests
 * 
 */
public class Climbing_Stairs {

	public int climbStairs(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (n == 0 || n == 1)
			return n;

		int[] a = new int[n + 1];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		for (int i = 3; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}

		return a[n];

	}

}