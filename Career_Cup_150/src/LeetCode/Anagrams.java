/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Wenzhe
 * @date Jul 10, 2013
 * 
 * passed all tests
 */
public class Anagrams {

	public ArrayList<String> anagrams(String[] strs) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();
		if (strs == null || strs.length <= 1)
			return res;
		HashMap<String, ArrayList<String>> ht = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] cc = strs[i].toCharArray();
			Arrays.sort(cc);
			// String b = a.toString() vs. String b = new String(a) ??
			String a = new String(cc);
			if (!ht.containsKey(a)) {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(strs[i]);
				ht.put(a, temp);
			} else {
				ArrayList<String> temp = ht.get(a);
				temp.add(strs[i]);
				ht.put(a, temp);
			}
		}

		for (ArrayList<String> as : ht.values()) {
			if (as.size() > 1)
				res.addAll(as);
		}
		return res;
	}
}
