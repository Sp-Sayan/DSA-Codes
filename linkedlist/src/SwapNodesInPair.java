/*
https://leetcode.com/problems/swap-nodes-in-pairs/
 */


public class SwapNodesInPair {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        //tail to store the 2nd node of every pair to join with the next node after swapping the next pair
        ListNode tail = null;

        while(curr != null){

            //swap nodes
            curr.next = prev;
            prev.next = next;

            //connect tail starting from 2nd pair
            if(tail != null)
                tail.next = curr;

            //for the first pair change position of head
            if(prev == head)
                head = curr;

            //store 2nd node of current pair
            tail = prev;

            //move to next pair
            prev = next;
            curr = (next != null)? next.next: null;
            next = (curr!= null)?curr.next: null;
        }

        return head;
    }
}
