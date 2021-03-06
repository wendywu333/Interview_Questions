/**
 * 
 */
package LeetCode;

import java.util.Arrays;

/**
 * @author Wenzhe
 * @date Jul 10, 2013
 * 
 * passed all tests
 */
public class Next_Permutation {

	public void nextPermutation(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (num == null || num.length <= 1)
			return;
		nextPmt(0, num);
	}

	private void nextPmt(int i, int[] num) {
		// TODO Auto-generated method stub
		if (i >= num.length - 1)
			return;
		boolean stop = false;
		// break outer loop
		int m = -1, q = -1;
		int min = Integer.MAX_VALUE;

		for (m = num.length - 1; m >= i + 1; m--) {
			if (num[m] > num[m - 1]) {
				stop = true;
				break;
			}
		}

		// there is no next permutation
		if (!stop) {
			System.out.println("sort run!");
			Arrays.sort(num, i, num.length);
			return;
		}

		for (int t = m; t < num.length; t++) {
			int a = num[t] - num[m - 1];
			// pay attention !! a<= min.. if a < min wrong!![2,3,1,1,3]
			if (a > 0 && a <= min) {
				min = a;
				q = t;
			}
		}

		int temp = num[q];
		num[q] = num[m - 1];
		num[m - 1] = temp;

		System.out.println(m + "     " + q);
		nextPmt(m, num);

	}

	public static void main(String args[]) {
		Next_Permutation o = new Next_Permutation();
		o.nextPermutation(new int[] { 2,3,1,3,3 });
	}
}
