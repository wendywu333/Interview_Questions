/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/4/2013 
 * passes all test cases
 * 
 */
public class Sort_Colors {

	public void sortColors(int[] A) {

		int lPtr = 0;
		int rPtr = A.length - 1;
		int current = 0;
		while (current <= rPtr && lPtr < A.length && rPtr >= 0 && lPtr < rPtr) {

			if (current == lPtr && A[lPtr] == 0) {
				current++;
			}

			if (A[current] == 1) {
				current++;
			} else if (A[current] == 0) {
				int temp = A[lPtr];
				A[lPtr] = A[current];
				A[current] = temp;
				lPtr++;
			} else {
				int temp = A[rPtr];
				A[rPtr] = A[current];
				A[current] = temp;
				rPtr--;
			}
		}

	}

	public static void main(String args[]) {
		int[] a = { 2, 1 };
		Sort_Colors o = new Sort_Colors();
		o.sortColors(a);
		for (int q : a) {
			System.out.print(q + " ");
		}

	}

}
