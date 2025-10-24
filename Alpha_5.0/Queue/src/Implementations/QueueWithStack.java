package Implementations;

import java.util.Stack;
//pop O(N)
public class QueueWithStack<T> {

    Stack<T> stack;

    public QueueWithStack() {
        stack = new Stack<>();
    }

    public void enqueue(T data){
        stack.push(data);
    }

    public T dequeue(){

        if(stack.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }

        //base case
        if(stack.size() == 1){
            return stack.pop();
        }

        T data = stack.pop();
        T popped = dequeue();
        stack.push(data);

        return popped;
    }

    @Override
    public String toString() {
        return "QueueWithStack{" +
                "queue=" + stack +
                '}';
    }
}
