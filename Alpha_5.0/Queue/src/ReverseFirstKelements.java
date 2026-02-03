/*
https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
 */

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelements {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        if(k > q.size())
            return q;

        Stack<Integer> s  = new Stack<>();

        //dequeue k elements
        for(int i = 0; i<k; i++)
            s.push(q.remove());

        //enqueue the reversed elements
        while(!s.isEmpty())
            q.add(s.pop());

        //add the rest of the elements from front to rear
        for(int i =0; i< q.size()-k; i++)
            q.add(q.remove());


        return q;
    }
}
