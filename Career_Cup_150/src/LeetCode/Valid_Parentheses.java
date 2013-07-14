/**
 * 
 */
package LeetCode;

import java.util.Stack;

/**
 * @author Wenzhe
 * @date Jul 13, 2013
 * 
 * passed all tests
 */
public class Valid_Parentheses {

	public boolean isValid(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {

			case '[':
				st.push('[');
				break;
			case ']':
				if (st.isEmpty() || st.pop() != '[')
					return false;
				break;
			case '{':
				st.push('{');
				break;
			case '}':
				if (st.isEmpty() || st.pop() != '{')
					return false;
				break;
			case '(':
				st.push('(');
				break;
			case ')':
				if (st.isEmpty() || st.pop() != '(')
					return false;
				break;
			}

		}
		return st.isEmpty();
	}

	public static void main(String args[]) {
		Valid_Parentheses o = new Valid_Parentheses();
		System.out.println(o.isValid("["));
	}
}
