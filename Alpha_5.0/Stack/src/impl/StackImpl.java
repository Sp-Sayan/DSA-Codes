package impl;

public class StackImpl {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(5);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
