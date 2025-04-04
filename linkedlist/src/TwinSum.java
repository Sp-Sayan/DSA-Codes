/*
https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */

public class TwinSum {
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        prev = null;
        ListNode next = slow.next;

        //reverse LL
        while(slow != null){

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        //now prev is at head of 2nd LL

        //find twin sum using prev and head;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(head != null && prev != null){
            sum = Integer.parseInt(head.data + prev.data);
            if(sum >= max)
                max = sum;

            head = head.next;
            prev = prev.next;
        }

        return max;


    }
}
