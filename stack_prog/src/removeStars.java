/*
https://leetcode.com/problems/removing-stars-from-a-string
 */
import java.util.*;

public class removeStars {
    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");


        for(int i = 0; i<arr.length;i++){
            if(arr[i].equals("*")){
                stack.pop();
            }
            else{
                stack.push(arr[i]);
            }
        }

        s = String.join("",stack);
        return s;
    }
}
