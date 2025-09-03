import java.util.Stack;

public class DuplicateParantheses {
    public static void main(String[] args) {
        String str = "((a+b) + (c+d))";

        System.out.println(findDuplicate(str));
    }

    private static boolean findDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if(x == ')'){
                //no popping means duplicate parantheses
                if(stack.peek() == '(')
                    return false;
                //finding the pair
                while(stack.peek() != '(')
                    stack.pop();
                //pop opening bracket
                stack.pop();
            } else {
                stack.push(x);
            }
        }
        return true;
    }
}
