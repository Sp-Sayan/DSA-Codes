/*
https://leetcode.com/problems/linked-list-cycle-ii/
 */

package sayan_LL;

public class LLCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){

            fast= fast.next.next;
            slow= slow.next;
            if(fast == slow)
                break;
        }
        //fast will be either null or at last node if no cycle
        if(fast == null || fast.next == null){
            return null;
        }

        while(head != slow){
            head = head.next;
            slow = slow.next;
        }
        return head;

    }
}
