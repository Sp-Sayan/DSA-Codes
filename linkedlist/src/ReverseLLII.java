public class ReverseLLII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right )
            return head;
        ;


        ListNode prev = null;
        ListNode current = head;
        while(left > 1){

            prev = current;
            current = current.next;
            left--;
            right--;
        }



        ListNode prevConnect = prev;        //to store previous node of start
        ListNode newTail = current;         //to store current node so that it can be attached to next node of right


        //reverse LL
        ListNode next = current.next;

        while(right > 0){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }

        //check if there is any prev node
        if(prevConnect !=null)
            prevConnect.next = prev;
        else
            head = prev;        //if no previous node we make the head = prev node i.e. prev is (now the right node)

        newTail.next = current; //we connect the left node to the now current node i.e the node after right

        return head;
    }
}
