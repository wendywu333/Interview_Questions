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
public class Palindrome_Number {

	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;
		if (x >= 0 && x < 10)
			return true;

		char[] a = new char[10];
		int size = 0;
		while (x > 0) {
			int i = x % 10;
			if (i >= 0 && i <= 9) {
				a[size] = Character.forDigit(i, 10);
				size++;
			}
			x = (x - (x % 10)) / 10;
		}

		int n = 0;
		while (n < size / 2) {
			if (a[n] != a[size - 1 - n]) {
				return false;
			}
			n++;
		}

		return true;

	}

}
