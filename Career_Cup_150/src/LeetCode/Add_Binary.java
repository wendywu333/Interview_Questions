/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jun 30, 2013
 * 
 * passed all tests
 * 
 */
public class Add_Binary {

	public String addBinary(String a, String b) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (a == null || a.length() == 0)
			return b;
		if (b == null || b.length() == 0)
			return a;

		StringBuilder sb = new StringBuilder();
		int car = 0;
		int i = a.length() - 1, j = b.length() - 1;
		int m, n;
		while (i >= 0 || j >= 0) {

			m = i >= 0 ? (int) a.charAt(i) - '0' : 0;
			n = j >= 0 ? (int) b.charAt(j) - '0' : 0;
			int val = m + n + car;
			if (val == 2) {
				car = 1;
				val = 0;
			} else if (val == 3) {
				car = 1;
				val = 1;
			} else {
				car = 0;
			}

			sb.append((char) (val + '0'));
			i--;
			j--;
		}

		if (car == 1) {
			sb.append('1');
		}

		sb.reverse();

		return sb.toString();

	}

}
