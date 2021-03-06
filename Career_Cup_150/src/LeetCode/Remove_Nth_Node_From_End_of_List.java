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
public class Remove_Nth_Node_From_End_of_List {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head.next == null) {
			return null;
		}

		ListNode ahead = head;
		ListNode fast = head;
		ListNode slow = head;

		int i = 0;
		while (i < n) {
			// corner case: hit the head
			if (fast.next == null) {
				ahead = ahead.next;
				return ahead;

			} else {
				fast = fast.next;
			}
			i++;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		ListNode target = slow.next;
		slow.next = target.next;

		return ahead;

	}

}
