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
public class Pascals_Triangle {

	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (numRows == 0)
			return res;
		ArrayList<Integer> lineOne = new ArrayList<Integer>(1);
		lineOne.add(1);
		res.add(lineOne);
		for (int i = 0; i < numRows - 1; i++) {
			ArrayList<Integer> newLine = new ArrayList<Integer>();
			ArrayList<Integer> lastLine = res.get(res.size() - 1);
			newLine.add(lastLine.get(0));
			for (int a = 0; a < lastLine.size() - 1; a++) {
				newLine.add(lastLine.get(a) + lastLine.get(a + 1));
			}
			newLine.add(lastLine.get(lastLine.size() - 1));
			res.add(newLine);
		}

		return res;

	}

}
