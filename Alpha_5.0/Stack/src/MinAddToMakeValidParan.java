/*
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */


import java.util.Stack;

public class MinAddToMakeValidParan {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int bracketCount = 0;

        for(int i = 0 ; i< s.length(); i++){
            char x = s.charAt(i);
            //count each bracket
            bracketCount++;
            if(x == '(')
                stack.push(x);
            else {

                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    //subtract 2 since two brackets () are removed
                    bracketCount -= 2;
                }

            }

        }

        return bracketCount;
    }
}
