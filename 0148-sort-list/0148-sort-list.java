/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy, t1 = list1, t2 = list2;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if (t1 == null && t2 != null)
            temp.next = t2;
        if (t2 == null && t1 != null)
            temp.next = t1;
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list1 = head;
        ListNode list2 = slow.next;
        slow.next = null;
        list1 = sortList(list1);
        list2 = sortList(list2);
        ListNode ansHead = merge(list1, list2);
        return ansHead;
    }
}