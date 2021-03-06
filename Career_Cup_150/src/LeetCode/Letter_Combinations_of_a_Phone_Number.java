/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date 6/26/2013
 * 
 * passed all tests
 * 
 */
public class Letter_Combinations_of_a_Phone_Number {

	public ArrayList<String> letterCombinations(String digits) {

		if (digits == null)
			return null;

		ArrayList<String> comb = new ArrayList<String>();
		comb.add("");

		String[] dMap = buildDMap();

		for (int i = 0; i < digits.length(); i++) {
			ArrayList<String> cur = new ArrayList<String>();
			char c = digits.charAt(i);
			if (c >= '2' && c <= '9') {
				for (String str : comb) {
					for (int t = 0; t < dMap[c - '2'].length(); t++) {
						cur.add(str + dMap[c - '2'].charAt(t));
					}
				}
			}

			comb = new ArrayList<String>(cur);
		}

		return comb;

	}

	private String[] buildDMap() {
		// TODO Auto-generated method stub
		String[] res = new String[8];
		char start = 'a';
		for (int i = 0; i < 8; i++) {
			int count;
			if (i == 5 || i == 7)
				count = 4;
			else
				count = 3;

			StringBuilder sb = new StringBuilder("");
			for (int j = 0; j < count; j++)
				sb.append((char) (start + j));

			res[i] = sb.toString();
			start = (char) (start + count);
		}
		return res;
	}

}
