
/*
TC - O(N)
SC - O(1)

Another approach - to use another stack SC will be O(N)
 */

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }

        System.out.println("Original: "+ stack.toString());

        reverseStack(stack);

        System.out.println("Reversed: " + stack.toString());
    }

    private static void reverseStack(Stack<Integer> stack) {
        //base case
        if(stack.isEmpty())
        {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack,top);

    }

    private static void pushAtBottom(Stack<Integer> stack, int data){

        //base case
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int top =  stack.pop();
        pushAtBottom(stack,data);
        stack.push(top);
    }
}
