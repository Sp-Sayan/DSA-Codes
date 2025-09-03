/*
https://www.geeksforgeeks.org/problems/sort-a-stack/
 */

import java.util.Stack;

//TC - O(N*N)
//SC - O(N) recursive
public class IMPORTANT_SortStack {
    public Stack<Integer> sort(Stack<Integer> s) {

        //base case
        if(s.isEmpty())
            return s;

        int top = s.pop();
        //empty stack one by one
        sort(s);
        //place top at the appropriate place
        pushAfterSort(s,top);

        return s;

    }


    public void pushAfterSort(Stack<Integer> s, int data){

        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //sort
        if(s.peek() > data){
            int top = s.pop();
            pushAfterSort(s,data);
            s.push(top);
        } else {
            s.push(data);
        }
    }
}
