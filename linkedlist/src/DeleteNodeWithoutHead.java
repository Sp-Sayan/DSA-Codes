public class DeleteNodeWithoutHead {
    public void deleteNode(ListNode node) {


        ListNode prev = node;
        ListNode curr = node.next;

        while(curr != null){
            prev.val = curr.val;
            prev = (curr.next == null)?prev:curr;
            curr = curr.next;
        }
        prev.next = null;

    }
}
