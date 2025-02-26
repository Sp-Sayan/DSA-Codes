/*
https://leetcode.com/problems/reverse-linked-list/description/
 */


public class ReverseLL {
    class ListNode{
        int val;
        ListNode next;

        ListNode(){
        }
    }
    //Iterative
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode prev=null;
        ListNode newHead=curr.next;
        while(curr != null){

            newHead =  curr.next;

            curr.next = prev;
            prev = curr;
            curr = newHead;

        }
        return prev;
    }

    //recursive
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode prev=null;
        ListNode newHead=curr.next;

        return recurReverse(prev,curr,newHead);
    }

    public ListNode recurReverse(ListNode prev, ListNode curr,ListNode newHead){
        if(curr == null && newHead == null)
            return prev;
        curr.next = prev;
        return recurReverse(curr,newHead,(newHead==null)?newHead:newHead.next);
    }
}
