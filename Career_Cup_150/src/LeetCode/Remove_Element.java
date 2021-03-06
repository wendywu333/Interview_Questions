/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/26/2013
 * 
 * passed all tests
 * 
 */
public class Remove_Element {

	public int removeElement(int[] A, int elem) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A == null)
			return 0;
		int size = A.length;
		int i = 0;
		while (i <= size - 1) {
			if (A[i] == elem) {
				while (A[size - 1] == elem && size > i) {
					size--;
					if (size == i)
						return i;
				}
				A[i] = A[size - 1];
				size--;
			}
			i++;
		}

		return size;

	}
}
