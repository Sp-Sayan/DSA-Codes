package Implementations;

public class QueueArrayImpl {
    public static void main(String[] args) {
        QueueArray arr = new QueueArray();

        arr.dequeue();
        System.out.println(arr.toString());
        for (int i = 0; i < 6; i++) {
            arr.enqueue(i+1);
            System.out.println(arr.toString());
        }
        System.out.println(arr.toString());
        arr.dequeue();
        System.out.println(arr.toString());
        arr.peek();
        System.out.println(arr.toString());

    }
}
