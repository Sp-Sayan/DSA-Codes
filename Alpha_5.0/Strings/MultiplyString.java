/*
 * https://leetcode.com/problems/multiply-strings/
 * 
 * Refer to this image: https://discuss.leetcode.com/assets/uploads/files/1497347627240-string-resized.jpg
 */

public class MultiplyString {
    public static String multiply(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int ptr1 = num1.length();
        int ptr2 = num2.length();

        Integer res = 0;

        int[] arr = new int[ptr1 + ptr2];

        // for num2
        for (int i = ptr2 - 1; i > -1; i--) {
            int arrPtr = i + ptr1;
            // for num1
            for (int j = ptr1 - 1; j > -1; j--) {

                res = (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                arr[arrPtr] += res % 10;
                // check for >10
                if (arr[arrPtr] > 9) {
                    // add carry first to prevent use of 3rd variable
                    arr[arrPtr - 1] += arr[arrPtr] / 10;
                    arr[arrPtr] = arr[arrPtr] % 10;
                }
                arr[--arrPtr] += res / 10;
            }
        }

        // avoid leading zeroes
        boolean leadingZero = true;
        for (int i : arr) {
            if (i != 0 || !leadingZero) {
                sb.append(i);
                leadingZero = false;
            }

        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
    }
}
