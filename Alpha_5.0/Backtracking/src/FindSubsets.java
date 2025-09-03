public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "",0);
    }

    private static void findSubsets(String str, String s, int i) {
        //base case
        if(i == str.length()) {
            System.out.println(s);
            return;
        }
        //YES choice
        findSubsets(str, s+str.charAt(i),i+1);

        //NO choice
        findSubsets(str,s,i+1);
    }
}
