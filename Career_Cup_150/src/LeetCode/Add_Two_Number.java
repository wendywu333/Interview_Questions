package LeetCode;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/28/2013
 * passed all test cases
 */
public class Add_Two_Number {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		int flag = 0;
		int value = l1.val + l2.val;
		if (value >= 10) {
			flag = 1;
		}
		ListNode result = new ListNode(value % 10);
		ListNode ptr = result;

		while (l1.next != null && l2.next != null) {
			l1 = l1.next;
			l2 = l2.next;
			value = l1.val + l2.val + flag;
			if (value >= 10) {
				flag = 1;
			}else{
				flag = 0;
			}
			result.next = new ListNode(value % 10);
			result = result.next;
		}

		while (l1.next != null) {
			l1 = l1.next;
			if (flag == 1) {
				int qvalue = l1.val + 1;
				result.next = new ListNode(qvalue % 10);
				if (qvalue < 10) {
					flag = 0;
				}
			} else {
				result.next = l1;
			}
			result = result.next;
		}

		while (l2.next != null) {
			l2 = l2.next;
			if (flag == 1) {
				int qvalue = l2.val + 1;
				result.next = new ListNode(qvalue % 10);
				if (qvalue < 10) {
					flag = 0;
				}
			} else {
				result.next = l2;
			}
			result = result.next;
		}

		if (flag == 1) {
			result.next = new ListNode(1);
		}

		return ptr;

	}
}
