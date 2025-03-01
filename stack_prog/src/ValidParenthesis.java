/*
https://leetcode.com/problems/valid-parentheses/
 */


import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[()]"));
    }



    public static boolean isValid(String s) {
        if(s.length() == 1)
            return false;

        Stack<Character> stack = new Stack<>();
        char x = ' ';




        for(int i=0;i<s.length();i++){
            x = s.charAt(i);

            if(!stack.isEmpty() && checkValid(stack,x))
                stack.pop();
            else
                stack.push(x);
        }

        return stack.isEmpty();
    }

    public static boolean checkValid(Stack<Character> stack, char x){

        char y = stack.peek();
        //System.out.println(y);

        if(y == '(' && x == ')')
            return true;

        if(y == '{' && x == '}')
            return true;

        if(y == '[' && x == ']')
            return true;

        return false;
    }
}
