import java.util.Stack;

public class ReverseString {

    //without extra mem
    public static String reverseString(String str, int idx,StringBuilder sb){
        //base
        if(idx == str.length())
            return "";
        char x = str.charAt(idx++);
        reverseString(str,idx,sb);
        return sb.append(x).toString();
    }


    public static void main(String[] args) {

        String str = "Hello World";

        StringBuilder sb = new StringBuilder();

        //WITH EXTRA MEM

//      Stack<Character> s = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            s.push(str.charAt(i));
//        }
//
//        while(!s.isEmpty()){
//            sb.append(s.pop());
//        }
//
//        System.out.println(sb.toString());
        System.out.println(reverseString(str,0,sb));

    }
}
