/*
https://leetcode.com/problems/decode-string/
 */

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char x = s.charAt(i);

            if(x != ']'){
                stack.push(Character.toString(x));
            } else {
                StringBuilder substring = new StringBuilder();

                //pop elements
                while(!stack.peek().equals("["))
                    substring.insert(0,stack.pop());

                //pop "["
                stack.pop();

                //to store digits
                StringBuilder digit = new StringBuilder();

                //pop the digits
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0)))
                    digit.insert(0,stack.pop());

                //get integer
                int k = Integer.parseInt(digit.toString());

                //append the string to stack
                while(k > 0){
                    stack.push(substring.toString());
                    k--;
                }

            }
        }

        return String.join("",stack);
    }
}
