package impl;

public class StackLLImpl {
    public static void main(String[] args) {
        StackLL s = new StackLL();

        s.push(1);
        s.push(2);
        s.push(5);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
