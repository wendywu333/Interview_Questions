/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/4/2013
 * passes all test cases
 * 
 */
public class Valid_Palindrome {

	public boolean isPalindrome(String s) {

		if (s.isEmpty()) {
			return true;
		}

		char[] a = new char[s.length()];
		int size = 0;

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					|| (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					|| (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				a[size++] = s.charAt(i);
			}
		}

		// for (char t : a) {
		// System.out.print(t + " ");
		// }

		// 'a' - 'A' = 32
		boolean result = true;
		int ptr = 0;
		while (ptr <= size - 1) {
			if (a[ptr] != a[size - 1] && Math.abs(a[ptr] - a[size - 1]) != 32) {
				result = false;
				break;
			}
			ptr++;
			size--;
		}

		return result;

	}

	public static void main(String args[]) {
		String s = "ab";
		Valid_Palindrome o = new Valid_Palindrome();
		System.out.println(o.isPalindrome(s));
	}

}
