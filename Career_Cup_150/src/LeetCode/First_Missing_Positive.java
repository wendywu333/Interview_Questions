/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jun 27, 2013
 * 
 * passes all tests
 * heap sort
 * 
 */
public class First_Missing_Positive {

	public int firstMissingPositive(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function

		int n = A.length;
		int temp;
		for (int i = 0; i < n; i++) {
			
			
			if (A[i] != i + 1 && A[i] > 0 && A[i] <= n) {

				// A[0] = 8 should be 1, put 8 to A[7];
				if (A[A[i] - 1] == A[i])
					continue;
				temp = A[A[i] - 1];
				A[A[i] - 1] = A[i];
				A[i] = temp;

				i--;

			}

			for (int a : A) {
				System.out.print(a + " ");
			}
			System.out.println(" ");
			System.out.println(i);
			
			// 0 2 2 1 1
		}

		for (int a : A) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < n; i++) {
			if (A[i] != i + 1)

				return i + 1;
		}

		return n + 1;

	}

	public static void main(String args[]) {
		int[] A = new int[] { 0, 2, 2, 1, 1 };
		First_Missing_Positive o = new First_Missing_Positive();
		o.firstMissingPositive(A);
	}

}
