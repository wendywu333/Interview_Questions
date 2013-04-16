package LeetCode;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/30/2013 passed all test cases
 */
public class Rotate_List {
	public ListNode rotateRight(ListNode head, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (n == 0 || head == null) {
			return head;
		}
		int size = 1;
		ListNode ptr = head;
		while (ptr.next != null) {
			size++;
			ptr = ptr.next;
		}
		if (n % size == 0) {
			return head;
		}
		ptr.next = head;
		ptr = head;
		for (int i = 0; i < size - n % size - 1; i++) {
			ptr = ptr.next;
		}
		head = ptr.next;
		ptr.next = null;
		return head;
	}
}
