/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 3/30/2013
 * passed all test cases
 * 
 */
public class Search_For_Range {
	public int[] searchRange(int[] A, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function

		int[] notValid = new int[2];
		notValid[0] = notValid[1] = -1;
		if (A.length == 0) {
			return notValid;
		}

		int where = findMe(0, A.length - 1, A, target);
		if (where == -1)
			return notValid;
		int startIndex = where;
		int endIndex = where;
		while (startIndex - 1 >= 0 && A[startIndex - 1] == target) {
			startIndex--;
		}
		while (endIndex + 1 <= A.length - 1 && A[endIndex + 1] == target) {
			endIndex++;
		}
		int[] result = new int[2];
		result[0] = startIndex;
		result[1] = endIndex;
		return result;

	}

	public static int findMe(int start, int end, int[] A, int target) {
		if ((start > end) || (start < 0) || (end > A.length - 1)) {
			return -1;
		}
		int middle = start + (int) (end - start) / 2;
		if (target == A[middle])
			return middle;
		else if (target > A[middle]) {
			return findMe(middle + 1, end, A, target);
		} else {
			return findMe(start, middle - 1, A, target);
		}
	}

	public static void main(String args[]) {
		int[] test = new int[2];
		test[0] = 2;
		test[1] = 2;
		int target = 3;

		Search_For_Range ex = new Search_For_Range();
		ex.searchRange(test, target);
	}

}
