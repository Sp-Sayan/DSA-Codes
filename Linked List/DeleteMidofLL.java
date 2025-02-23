/*
https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 */

package sayan_LL;

public class DeleteMidofLL {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        //search mid
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //delete mid
        prev.next = slow.next;
        slow.next = null;

        return head;
    }
}
