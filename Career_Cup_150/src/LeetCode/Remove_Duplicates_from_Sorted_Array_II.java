/**
 * 
 */
package LeetCode;

import java.util.HashMap;

/**
 * @author Wenzhe
 * @date Jul 18, 2013
 * 
 * passed all tests
 */
public class Remove_Duplicates_from_Sorted_Array_II {

	public int removeDuplicates(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!ht.containsKey(A[i])) {
				ht.put(A[i], 1);
			} else {
				ht.put(A[i], ht.get(A[i]) + 1);
			}
		}

		int size = 0;
		boolean stop = true;
		for (int j = 0; j < A.length & stop; j++) {
			if (j > 0) {
				while (A[j] == A[j - 1]) {
					j++;
					if (j == A.length) {
						stop = false;
						break;
					}
				}
			}
			if (stop) {
				for (int i = 0; i < ht.get(A[j]); i++) {
					A[size] = A[j];
					size++;
					if (i == 1)
						break;
				}
			}
		}

		return size;
	}

	public static void main(String args[]) {
		Remove_Duplicates_from_Sorted_Array_II o = new Remove_Duplicates_from_Sorted_Array_II();
		o.removeDuplicates(new int[] { 1, 1, 1 });
	}

}
