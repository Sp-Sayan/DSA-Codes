import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    private static int[] nextGreater(int[] arr) {
        int[] next = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        next[next.length-1] = -1;
        stack.push(arr[arr.length-1]);

        for (int i = arr.length-2; i > -1; i--) {

            //pop smaller elements
            while(!stack.isEmpty() && arr[i] > stack.peek()){
                stack.pop();
            }

            next[i] = (stack.isEmpty()) ? -1 : stack.peek();

            //push
            stack.push(arr[i]);
        }

        return next;
    }
}
