/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/26/2013
 * 
 * passes all tests
 * 
 */
public class Search_Insert_Position {

	public int searchInsert(int[] A, int target) {

		if (A.length == 0)
			return 0;

		int result = search(A, 0, A.length - 1, target);

		return result;

	}

	private int search(int[] a, int i, int j, int target) {
		// TODO Auto-generated method stub
		if (i == j && a[i] == target)
			return i;
		if (i == j && a[i] > target) {
			return i;
		}
		if (i == j && a[i] < target) {
			return j + 1;
		}

		if (target == a[i + (j - i) / 2])
			return i + (j - i) / 2;
		if (target < a[i + (j - i) / 2]) {
			return search(a, i, i + (j - i) / 2, target);
		} else {
			return search(a, i + 1 + (j - i) / 2, j, target);
		}

	}

}
