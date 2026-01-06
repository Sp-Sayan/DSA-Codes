/*
https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
 */

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {
    public void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        //store first half to new queue (2nd half remains in the original one)
        for(int i = 0; i<size/2;i++){
            firstHalf.add(q.remove());
        }

        //add elements alternately
        boolean secondHalfElement = false;

        for(int i = 0; i< size;i++){

            if(secondHalfElement){
                q.add(q.remove());

            } else {
                q.add(firstHalf.remove());

            }

            secondHalfElement = !secondHalfElement;
        }
    }
}
