import java.util.Scanner;

public class LL {
    static ListNode head;

    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data){
        ListNode newListNode = new ListNode(data);
        if(head == null){
            head = newListNode;
            return;
        }
        ListNode ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = newListNode;

    }
    //Recursive insertion
    public void insertRec(ListNode ptr,String data, int index)
    {
        if(index == 0){
            ListNode newListNode = new ListNode(data);
            newListNode.next = head;
            head = newListNode;
        }
        else if(index == 1){
            ListNode temp = ptr.next;
            ListNode newListNode = new ListNode(data);
            ptr.next = newListNode;
            newListNode.next = temp;
        }
        else{
            insertRec(ptr.next,data,index-1);
        }
    }

    public void printList(){
         if(head == null)
         {
             System.out.println("List Empty");
             return;
         }

         ListNode ptr = head;
         while(ptr != null){
             System.out.println(ptr.data + " ");
             ptr = ptr.next;
         }
    }

    public void delete(){
         Scanner sc = new Scanner(System.in);

         if(head == null){
             System.out.println("List is empty");
             return;
         }
         ListNode ptr = head;
         System.out.print("Enter position to delete: ");
         int pos = sc.nextInt(), count = 1;
         if(pos == 1){
             head = head.next;
             return;
         }
        while(pos - 1 > count){
            ptr = ptr.next;
            count++;
        }

        if(ptr.next == null && pos > count){
            System.out.println("List is smaller");
            return;
        }
        ListNode temp = ptr.next;
        ptr.next = temp.next;
        temp.next = null;

    }

    public static void main(String[] args) {

        LL obj = new LL();
        obj.addLast("c");
        obj.addLast("d");
        obj.addLast("a");
        obj.addLast("z");
        obj.printList();
        //obj.delete();
        //obj.printList();
        System.out.println("After Recursion: ");
        obj.insertRec(head,"recur1",3);
        obj.printList();
        System.out.println("After Recursion: ");
        obj.insertRec(head,"recur2",0);
        obj.printList();
        System.out.println("After Recursion: ");
        obj.insertRec(head,"recur3",6);
        obj.printList();
    }

}
