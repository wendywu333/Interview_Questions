/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 3, 2013
 * 
 * passed all tests
 * 
 */
public class Reverse_Linked_List_II {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (m == n)
			return head;
		ListNode h = new ListNode(-1);
		h.next = head;
		ListNode cur = h;

		int pos = 0;
		while (pos < m - 1) {
			cur = cur.next;
			pos++;
		}
		ListNode last = cur;
		cur = cur.next;
		pos++;
		ListNode temp, temp3;
		ListNode temp2 = cur;
		while (pos <= n) {

			temp = cur.next;

			temp3 = last.next;
			last.next = cur;
			cur.next = temp3;

			cur = temp;
			pos++;
		}

		temp2.next = cur;

		return h.next;

	}
}
