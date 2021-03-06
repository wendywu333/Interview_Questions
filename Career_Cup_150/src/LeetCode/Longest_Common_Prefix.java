/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 4/7/2013
 * 
 * passes all tests
 * 
 */
public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {

		String res = "";
		if (strs.length == 0) {
			return res;
		}
		StringBuilder sb = new StringBuilder();
		if (strs[0].length() == 0) {
			return res;
		} else {
			sb.append(strs[0]);
		}
		for (int i = 1; i < strs.length; i++) {
			// if (strs[i].length() == 0) {
			// return res;
			// }
			if (strs[i].length() < sb.length()) {
				sb.delete(strs[i].length(), sb.length() + 1);
			}
			for (int j = 0; j < strs[i].length(); j++) {
				if (j > sb.length() - 1)
					break;
				if (strs[i].charAt(j) != sb.charAt(j)) {
					sb.delete(j, sb.length());
					break;
				}
			}
		}

		return sb.toString();
	}

	public static void main(String args[]) {
		String s1 = "flower";
		String s2 = "flow";
		String s3 = "flight";
		String[] a = new String[3];
		a[0] = s1;
		a[1] = s2;
		a[2] = s3;
		Longest_Common_Prefix o = new Longest_Common_Prefix();
		System.out.println(o.longestCommonPrefix(a));

	}
}
