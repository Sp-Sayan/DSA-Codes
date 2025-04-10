/*
 *  https://leetcode.com/problems/sort-colors/
 */

public class SortColourDNF {
    // DNF
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        int temp = 0;
        while (mid <= end) {

            // if 2, we swap(mid.end) & end--
            if (nums[mid] == 2) {
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            } else if (nums[mid] == 0) {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            } else {
                mid++;
            }

        }

    }

    // WITHOUT DNF
    public void sortColors2(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        // count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;

            if (nums[i] == 1)
                one++;

            if (nums[i] == 2)
                two++;
        }

        int k = 0;

        while (zero > 0 || one > 0 || two > 0) {
            if (zero > 0) {
                nums[k] = 0;
                zero--;
            } else if (one > 0) {
                nums[k] = 1;
                one--;
            } else {
                nums[k] = 2;
                two--;
            }
            k++;
        }
    }

}