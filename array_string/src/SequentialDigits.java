import java.util.ArrayList;


public class SequentialDigits {

    public static void main(String[] args) {
        for(int c : sequentialDigits(100,10000)){
            System.out.println(c);
        }
    }

    public static ArrayList<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> myList  = new ArrayList<>();

        int num = 0;
        while(num < high){
            int len = Integer.toString(low).length();
            int add = numGen(len);
        }


        return myList;
    }

    public static int numGen(int len){
        int num = 1;
        while (len > 0){
            num = num*10 + 1;
        }
        return num;
    }
}
