/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 6, 2013
 * 
 * passed all test
 * 
 */
public class Partition_List {

	public ListNode partition(ListNode head, int x) {

		if (head == null)
			return null;
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode placeholder = new ListNode(x - 1);
		placeholder.next = head;

		head = placeholder;
		while (head != null) {
			// head: the last small one
			while (head.next != null && head.next.val < x)
				head = head.next;
			if (head.next == null)
				break;

			// n2 the last big one
			ListNode n2 = head.next;
			while (n2.next != null && n2.next.val >= x)
				n2 = n2.next;
			if (n2.next == null)
				break;

			ListNode n3 = n2.next;
			while (n3.next != null && n3.next.val < x)
				n3 = n3.next;

			ListNode temp = n2.next;
			n2.next = n3.next;
			n3.next = head.next;
			head.next = temp;
		}

		return placeholder.next;
	}

	public static void main(String args[]) {
		ListNode a = new ListNode(2);
		a.next = new ListNode(1);
		Partition_List o = new Partition_List();
		o.partition(a, 2);
	}

}

// Below exceed time limits

// public ListNode partition(ListNode head, int x) {
// // Start typing your Java solution below
// // DO NOT write main() function
// ListNode placeholder = new ListNode(0);
// ListNode pivot = new ListNode(0);
// ListNode prev = placeholder;
// ListNode last = pivot;
// while (head != null) {
// if (head.val < x) {
// prev.next = head;
// prev = prev.next;
// } else {
// last.next = head;
// last = last.next;
// }
// head = head.next;
// }
// prev.next = pivot.next;
// // System.out.println(placeholder.next.val);
// return placeholder.next;
//
// }

// public ListNode partition(ListNode head, int x) {
//
// if (head == null)
// return null;
// // Start typing your Java solution below
// // DO NOT write main() function
// ListNode placeholder = new ListNode(x - 1);
// placeholder.next = head;
// ListNode prev = placeholder;
// ListNode temp;
// while (head != null) {
// if (head.val < x) {
// temp = head.next;
// head.next = prev.next;
// prev.next = head;
// prev = prev.next;
// head = temp;
// } else {
// head = head.next;
// }
// }
// return placeholder.next;
// }
