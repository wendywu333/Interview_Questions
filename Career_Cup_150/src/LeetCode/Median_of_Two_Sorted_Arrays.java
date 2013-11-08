/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/25/2013
 * 
 *       not finished - hard
 * 
 */
public class Median_of_Two_Sorted_Arrays {

	public double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length;
		int n = B.length;

		if ((m + n) % 2 != 0) // odd number of total elements
			return (double) findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
		else { // even
			return (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) + findKth(A,
					B, (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
		}
	}

	public static int findKth(int A[], int B[], int k, int ista_A, int iend_A,
			int ista_B, int iend_B) {

		int nA = iend_A - ista_A + 1;
		int nB = iend_B - ista_B + 1;

		// Special cases
		if (nA == 0)
			return B[ista_B + k];
		if (nB == 0)
			return A[ista_A + k];
		if (k == 0)
			return A[ista_A] < B[ista_B] ? A[ista_A] : B[ista_B];

		// Reduce search ranges in A and B
		int imid_A = nA * k / (nA + nB);
		int imid_B = k - imid_A - 1;

		// Add offset so that imid_A and imid_B index directly into A and B,
		// respectively
		imid_A += ista_A;
		imid_B += ista_B;

		if (A[imid_A] > B[imid_B]) {
			k -= imid_B - ista_B + 1;
			iend_A = imid_A;
			ista_B = imid_B + 1;
		} else {
			k -= imid_A - ista_A + 1;
			iend_B = imid_B;
			ista_A = imid_A + 1;
		}

		return findKth(A, B, k, ista_A, iend_A, ista_B, iend_B);

	}
}
