import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
        demo(1,2,3,4,5,6,7,8);
    }

    static void demo(int ...v){                 // variable no. of arguments
        System.out.println(Arrays.toString(v));
    }
}
