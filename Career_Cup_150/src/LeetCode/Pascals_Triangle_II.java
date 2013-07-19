/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date Jul 19, 2013
 *
 * passed all tests
 */
public class Pascals_Triangle_II {

	public ArrayList<Integer> getRow(int rowIndex) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(1);
		int temp = 0, temp2 = 1;
		for (int i = 0; i < rowIndex; i++) {
			for (int j = 1; j < res.size(); j++) {
				temp = res.get(j);
				res.set(j, res.get(j) + temp2);
				temp2 = temp;
			}
			res.add(1);
		}

		return res;
	}
}
