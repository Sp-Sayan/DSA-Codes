/*
https://leetcode.com/problems/reorder-list/
 */



package sayan_LL;

public class ReOrderList {

    public void reorderList(ListNode head) {
        if(head.next == null)
            return;

        ListNode tail1 = null;
        ListNode slow=head;
        ListNode fast = head;
        //finding mid
        while(fast !=null && fast.next!=null){
            tail1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        tail1.next = null;          //breaking LL into 2 new LL

        //Reversing the 2nd part of original LL
        ListNode prev =null;
        ListNode curr = slow;
        ListNode next = curr.next;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode ptr = head;
        while(prev != null){
            if(ptr.next == null){
                ptr.next = prev;
                prev = prev.next;
                ptr = ptr.next;
                ptr.next = null;
            }
            else{
                ListNode prevTemp = prev.next;
                //swapping
                prev.next = ptr.next;
                ptr.next = prev;
                ptr = prev.next;
                prev = prevTemp;
            }

        }


    }
}
