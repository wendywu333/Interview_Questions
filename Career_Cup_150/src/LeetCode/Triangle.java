/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date Jul 12, 2013
 * 
 * passed all tests
 */
public class Triangle {

	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {

		// level i (from top) has i+1 elements
		if (triangle == null || triangle.size() == 0)
			return 0;
		int n = triangle.size();

		int[] min = new int[n];
		// level n-1 (from top) has n elements, the most right's index is n-1

		for (int i = 0; i < n; i++) {
			min[i] = triangle.get(n - 1).get(i);
		}

		for (int j = n - 2; j >= 0; j--) {
			for (int i = 0; i <= j; i++) {
				int temp = min[i];
				min[i] = temp < min[i + 1] ? triangle.get(j).get(i) + temp
						: triangle.get(j).get(i) + min[i + 1];
			}
		}

		return min[0];
	}

	public static void main(String args[]) {
		Triangle o = new Triangle();
		ArrayList<ArrayList<Integer>> t = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(3);
		t.add(al1);
		t.add(al2);
		o.minimumTotal(t);

	}
}
