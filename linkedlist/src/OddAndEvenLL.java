/*
https://leetcode.com/problems/odd-even-linked-list
 */

public class OddAndEvenLL {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null)
            return head;
        ListNode insertPoint = head;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){

            //swap
            slow.next = fast.next;
            //ListNode temp = fast.next;
            fast.next = insertPoint.next;
            insertPoint.next = fast;
            insertPoint = fast;
            fast = slow.next.next;

            slow = slow.next;

        }

        //for last node of odd no. of nodes
        if(fast != null){
            //swap
            slow.next = fast.next;
            //ListNode temp = fast.next;
            fast.next = insertPoint.next;
            insertPoint.next = fast;
            insertPoint = fast;
        }

        return head;
    }
}
