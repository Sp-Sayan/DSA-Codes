package sayan_LL;

import java.util.Scanner;

public class LL {
    static Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = newNode;

    }
    //Recursive insertion
    public void insertRec(Node ptr,String data, int index)
    {
        if(index == 0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        else if(index == 1){
            Node temp = ptr.next;
            Node newNode = new Node(data);
            ptr.next = newNode;
            newNode.next = temp;
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

         Node ptr = head;
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
         Node ptr = head;
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
        Node temp = ptr.next;
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
