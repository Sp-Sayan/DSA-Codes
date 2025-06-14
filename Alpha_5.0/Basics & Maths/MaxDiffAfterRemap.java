/*
 * https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/
 */

public class MaxDiffAfterRemap {

    public int minMaxDifference(int num) {
        int min = 0;
        int max = 0;
        char remap = ' ';

        String n2 = Integer.toString(num);

        // find first non-nine digit for max
        for (int i = 0; i < n2.length(); i++) {
            char x = n2.charAt(i);

            if (x != '9') {
                remap = x;
                break;
            }

        }

        // find max
        for (int i = 0; i < n2.length(); i++) {
            char x = n2.charAt(i);
            int digit = Integer.parseInt(Character.toString(x));

            if (x == remap)
                digit = 9;

            max = (max * 10) + digit;
        }

        // find first non zero digit for min
        for (int i = 0; i < n2.length(); i++) {
            char x = n2.charAt(i);

            if (Integer.parseInt(Character.toString(x)) > 0) {
                remap = x;
                break;
            }

        }

        // find min
        for (int i = 0; i < n2.length(); i++) {
            char x = n2.charAt(i);
            int digit = Integer.parseInt(Character.toString(x));

            if (x == remap)
                digit = 0;

            min = (min * 10) + digit;
        }

        return max - min;
    }
}