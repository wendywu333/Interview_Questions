/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 1, 2013
 * 
 * passed all tests
 * 
 */
public class Count_and_Say {

	public String countAndSay(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String res = "";
		if (n == 0)
			return res;
		res = "1";
		while (n > 1) {
			n--;
			StringBuilder sb = new StringBuilder();
			int i = 0;
			int size = 1;
			while (i < res.length()) {
				
				if(res.length() == 1){
					sb.append('1');
					sb.append(res.charAt(0));
					break;
				}
				
				if (res.charAt(i) == res.charAt(i + 1)) {
					if (i + 1 == res.length() - 1) {
						sb.append((char) (size + 1 + '0'));
						sb.append(res.charAt(i));
						break;
					}
					i++;
					size++;
				} else {

					sb.append((char) (size + '0'));
					sb.append(res.charAt(i));

					if (i + 1 == res.length() - 1) {

						sb.append((char) (1 + '0'));
						sb.append(res.charAt(i + 1));
						break;
					}
					i++;
					size = 1;

				}

			}
			res = sb.toString();
		}

		return res;

	}

}
