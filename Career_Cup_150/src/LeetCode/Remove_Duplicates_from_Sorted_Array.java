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
public class Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A == null || A.length == 0)
			return 0;
		int size = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] != A[i - 1]) {
				A[size] = A[i];
				size++;
			}
		}
		return size;
	}

}
