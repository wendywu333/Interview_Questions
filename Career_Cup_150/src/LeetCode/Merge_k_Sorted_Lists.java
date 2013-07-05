/**
 * 
 */
package LeetCode;

import java.util.ArrayList;

/**
 * @author Wenzhe
 * @date Jun 30, 2013
 * 
 *       passed all tests
 * 
 */
public class Merge_k_Sorted_Lists {

	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (lists == null || lists.isEmpty())
			return null;

		while (lists.size() > 1) {
			ArrayList<ListNode> cur = new ArrayList<ListNode>();
			for (int i = 0; i < lists.size(); i = i + 2) {
				cur.add(merge(lists.get(i), lists.get(i + 1)));
				if (i + 2 == lists.size() - 1) {
					cur.add(lists.get(i + 2));
					break;
				}
			}

			lists = new ArrayList<ListNode>(cur);
		}

		return lists.get(0);

	}

	private ListNode merge(ListNode node1, ListNode node2) {
		// TODO Auto-generated method stub

		ListNode placeholder = new ListNode(-1);
		ListNode cur = placeholder;
		while (node1 != null || node2 != null) {
			int val1 = node1 == null ? Integer.MAX_VALUE : node1.val;
			int val2 = node2 == null ? Integer.MAX_VALUE : node2.val;

			if (val1 < val2) {

				cur.next = node1;
				node1 = node1.next;

			} else {

				cur.next = node2;
				node2 = node2.next;

			}

			cur = cur.next;
		}

		return placeholder.next;
	}

}