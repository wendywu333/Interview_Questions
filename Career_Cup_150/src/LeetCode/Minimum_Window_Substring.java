/**
 * 
 */
package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author Wenzhe
 * @date Jul 2, 2013
 * 
 * passed all tests
 * 
 */
public class Minimum_Window_Substring {

	public String minWindow(String S, String T) {
		// Start typing your Java solution below
		// DO NOT write main() function
		// Given a string S and a string T, find the minimum window in S which
		// will contain all the characters in T in complexity O(n).
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();
		int minlength = Integer.MAX_VALUE;
		int startIndex = -1;

		HashMap<Character, Integer> ht = new HashMap<Character, Integer>();
		HashMap<Character, LinkedList<Integer>> ht2 = new HashMap<Character, LinkedList<Integer>>();

		for (int j = 0; j < T.length(); j++) {
			if (ht.containsKey(T.charAt(j))) {
				ht.put(T.charAt(j), ((int) ht.get(T.charAt(j)) + 1));
			} else {
				ht.put(T.charAt(j), 1);
			}
		}

		int count = T.length();

		for (int i = 0; i < S.length(); i++) {

			char c = S.charAt(i);

			if (ht.containsKey(c)) {

				if (count > 0) {
					if (!ht2.containsKey(c)) {
						LinkedList<Integer> ll = new LinkedList<Integer>();
						ll.add(i);
						ht2.put(c, ll);
						count--;
					} else {

						LinkedList<Integer> temp = (LinkedList<Integer>) ht2
								.get(c);
						if (temp.size() < (int) ht.get(c)) {
							count--;
						}
						temp.add(i);
						ht2.put(c, temp);
					}

					if (count == 0) {
						LinkedList<Integer> temp;
						for(Character ch:ht2.keySet()){
							temp = (LinkedList<Integer>) ht2.get(ch);
							while(temp.size() > ht.get(ch)){
								temp.removeFirst();							
							}
							min.add(temp.getFirst());
							ht2.put(ch, temp);
						}
						startIndex = min.peek();
						minlength = i - startIndex + 1;
					}
				} else { // if count == 0

					LinkedList<Integer> temp = (LinkedList<Integer>) ht2.get(c);

					min.remove(temp.getFirst());
					temp.removeFirst();
					temp.add(i);
					min.add(temp.getFirst());
					ht2.put(c, temp);

					if (i - min.peek() + 1 < minlength) {
						minlength = i - min.peek() + 1;
						startIndex = min.peek();
					}

				}
			}
		}

		if (count > 0)
			return "";

		return S.substring(startIndex, startIndex + minlength);
	}

	public static void main(String args[]) {
		System.out.println(new Minimum_Window_Substring()
				.minWindow("bba", "ab"));
	}

}
