/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/25/2013
 * revised on 6/20/2013
 * 
 *       passed all tests
 * 
 */
public class Reverse_Integer {

	public int reverse(int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		// -123 to -321
		boolean neg = false;
		if (x == 0)
			return 0;

		int result = 0;
		if (x < 0) {
			neg = true;
			x = 0 - x;
		}

		while (x > 0) {
			result = x % 10 + result * 10;
			x = x / 10;
		}

		return neg ? (0 - result) : result;
	}

	public static void main(String args[]) {
		Reverse_Integer o = new Reverse_Integer();
		System.out.println(o.reverse(-127289473));

	}

}
