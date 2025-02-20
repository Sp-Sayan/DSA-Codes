/*
https://leetcode.com/problems/reverse-nodes-in-k-group/
 */

package sayan_LL;

public class ReverseNodesInKGrp {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head.next == null)
            return head;

        ListNode prev = null;
        ListNode checkSize = head;

        do{
            int count = k;

            ListNode curr = (prev == null)?head:prev.next;
            ListNode next = curr.next;

            ListNode connection = prev;
            ListNode newTail = curr;




            //reverse k nodes in a single loop
            count = k;
            while(count > 0){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count--;
            }

            //join the group with rest of the LL
            newTail.next = curr;

            if(connection == null)      //check if it is the first set of nodes
                head = prev;
            else
                connection.next =prev;


            prev = newTail;

            //we check if remaining size = k
            count = 0;
            checkSize = prev;

            while(count < k && checkSize != null){
                checkSize = checkSize.next;
                count++;
            }

            if(checkSize == null)   //if remaining size < k we break the loop
                break;


        }while(true);

        return head;
    }
}
