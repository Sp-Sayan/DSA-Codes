/*
 * https://leetcode.com/problems/count-and-say/
 */

//26ms
public class RLE {

    public static String countAndSay(int n) {

        if (n == 1)
            return "1";

        String word = "1";

        // start from 2 as iter 1 is "1"
        for (int i = 2; i <= n; i++) {
            String wordRle = "";
            char unique = word.charAt(0);
            Integer count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == unique)
                    count++;
                else {
                    wordRle += count.toString() + unique;
                    unique = word.charAt(j);
                    count = 1;
                }

            }
            // for the last set of numbers
            wordRle += count.toString() + unique;
            word = wordRle;
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
