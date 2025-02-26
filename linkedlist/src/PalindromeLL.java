/*
https://leetcode.com/problems/palindrome-linked-list/
 */


public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
            return true;

        ListNode tail1 = null;
        ListNode slow=head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            tail1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prevConn = tail1;
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

        //now prev = the tail of original LL
        //check if LL1 and LL2 are equal
        while(head != null && prev != null){
            if(head.val != prev.val)
                return false;
            head = head.next;
            prev = prev.next;
        }

        return true;





    }
}
