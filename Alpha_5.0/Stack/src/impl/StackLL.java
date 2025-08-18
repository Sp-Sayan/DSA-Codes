package impl;

public class StackLL {

    static Node head = null;

    //empty
    public boolean isEmpty(){
        return head == null;
    }

    //push
    public void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    //pop
    public int pop(){
        if(isEmpty())
            return -1;
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public int peek(){
        return head.data;
    }

}
