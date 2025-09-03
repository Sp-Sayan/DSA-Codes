public class FindPermutations {



    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str,"");
    }

    private static void findPermutations(String str, String s) {
        //base case
        if(str.length() == 0){
            System.out.println(s);
            return;
        }
        //recursion
        for(int i =0; i<str.length();i++){
            char x = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(newStr,s+x);
        }
    }
}
