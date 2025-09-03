package Implementations;

import java.util.Arrays;

public class QueueArray {

    private int[] arr;
    private int front;
    private int rear;

    QueueArray(){
        arr = new int[5];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        return rear == arr.length -1;
    }

    public void enqueue(int data){

        if(rear == -1)
            front++;

        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = data;

    }

    public int dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int deleted = arr[front];

        //shift elements
        for (int i = front + 1; i <= rear; i++) {
            arr[i-1] = arr[i];
        }
        rear--;

        return deleted;
    }

    public int peek(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "arr=" + Arrays.toString(arr) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
