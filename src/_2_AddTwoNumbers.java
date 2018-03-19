//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
public class _2_AddTwoNumbers {
	public static class ListNode {
		private int val;
		private ListNode next;
		
		public ListNode(int value) {val = value;}
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr = new ListNode(-1);
		ListNode tail = curr;
		int carry = 0;
		
		while (l1 != null || l2 != null) {
			int val1 = (l1 == null?0 : l1.val);
			int val2 = (l2 == null?0 : l2.val);
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			ListNode temp = new ListNode(sum % 10);
			while (l1 != null) l1 = l1.next;
			while (l2 != null) l2 = l2.next;
			curr.next = temp;
			curr = curr.next;
		}
		
		if (carry != 0 ) {
			ListNode temp = new ListNode(carry);
			curr.next = temp;
			curr = curr.next;
		}
		
		return tail.next;
	}
}
