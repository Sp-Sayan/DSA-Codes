import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> original,int data){
        Stack<Integer> temp = new Stack<>();

        //copy
        while(!original.isEmpty()){
            temp.push(original.pop());
        }

        //push at bottom
        original.push(data);
        //copy
        while(!temp.isEmpty()){
            original.push(temp.pop());
        }

    }

    public static void printAndPop(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

       pushAtBottomWithoutMem(s,4);

       printAndPop(s);

    }


    //with O(1) space
    public static void pushAtBottomWithoutMem(Stack<Integer> original,int data){
        //base case
        if(original.isEmpty()){
            original.push(data);
            return;
        }

        int top = original.pop();
        pushAtBottomWithoutMem(original,data);
        original.push(top);

    }
}
