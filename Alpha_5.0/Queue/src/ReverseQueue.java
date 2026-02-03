/*
https://www.geeksforgeeks.org/problems/queue-reversal/1
 */

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}
