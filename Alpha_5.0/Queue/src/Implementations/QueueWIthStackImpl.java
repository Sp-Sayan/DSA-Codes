package Implementations;

public class QueueWIthStackImpl {
    public static void main(String[] args) {
        QueueWithStack<Integer> queue = new QueueWithStack<>();

        queue.dequeue();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
    }
}
