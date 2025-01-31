package sayan_LL;

/*
https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode rotateRight(ListNode head, int k) {
        ListNode ptr = head;
        int count = 0;
        if (ptr == null || ptr.next == null)
            return head;

        while (ptr.next != null){
            ptr = ptr.next;
            count++;
        }
        ptr.next = head;
        k = k%(++count);    //after rotating count times it is the same linkedlist
        ptr = head;

        for (int i = 1; i < count-k; i++) {     
            //System.out.println(ptr.val);
            ptr = ptr.next;
        }

        head = ptr.next;
        ptr.next = null;
        return head;
    }
}
