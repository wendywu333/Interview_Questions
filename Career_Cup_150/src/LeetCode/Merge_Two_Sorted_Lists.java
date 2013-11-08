/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date 6/27/2013
 * revised 6/30/2013
 * 
 * passes all tests
 * 
 */
public class Merge_Two_Sorted_Lists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode placeholder = new ListNode(-1);
		ListNode cur = placeholder;
		while (l1 != null || l2 != null) {
			int val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
			int val2 = l2 == null ? Integer.MAX_VALUE : l2.val;

			if (val1 < val2) {

				cur.next = l1;
				l1 = l1.next;

			} else {

				cur.next = l2;
				l2 = l2.next;

			}

			cur = cur.next;
		}

		return placeholder.next;
	}
}
