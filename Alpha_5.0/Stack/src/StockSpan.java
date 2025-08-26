import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,85,100};
        System.out.println(Arrays.toString(getSpan(arr)));
    }

    private static int[] getSpan(int[] arr) {
        int[] highs = new int[arr.length];
        Stack<Integer> idx = new Stack<>();

        highs[0] = 1;
        idx.push(0);

        for (int i = 1; i < arr.length; i++) {

            //pop all elements smaller than current
            while(!idx.isEmpty() && arr[i] >= arr[idx.peek()]){
                idx.pop();
            }
            //calculate span
            highs[i] = (idx.isEmpty()) ? i+1 : i - idx.peek() ;

            //push index
            idx.push(i);

        }

        return highs;


    }
}
