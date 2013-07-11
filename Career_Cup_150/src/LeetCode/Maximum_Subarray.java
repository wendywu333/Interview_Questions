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
public class Maximum_Subarray {

	public int maxSubArray(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A == null || A.length == 0)
			return 0;
		int resMax = Integer.MIN_VALUE;
		int max = 0;

		for (int i = 0; i < A.length; i++) {
			if (max > 0)
				max = max + A[i];
			else
				max = A[i];

			resMax = max > resMax ? max : resMax;
		}

		return resMax;
	}

}