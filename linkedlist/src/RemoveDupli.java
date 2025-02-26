public class RemoveDupli {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;

        ListNode ptr = head;
        ListNode temp = head;
        int unique = ptr.val;
        while(ptr != null){
            if(ptr.val != unique){
                unique = ptr.val;
                temp.next = ptr;
                temp = ptr;
            }
            else if(ptr.next == null)
                temp.next = null;

            ptr = ptr.next;
        }
        return head;

    }
}
