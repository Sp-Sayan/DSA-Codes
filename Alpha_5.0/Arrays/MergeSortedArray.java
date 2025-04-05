/*
 *  https://leetcode.com/problems/merge-sorted-array/
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1.length == 0 || nums2.length == 0)
            return;

        int e1 = m - 1;
        int e2 = n - 1;
        int insert = m + n - 1;

        while (e2 > -1) {
            if (e1 > -1 && nums1[e1] >= nums2[e2]) {
                nums1[insert] = nums1[e1];
                e1--;
            } else {
                nums1[insert] = nums2[e2];
                e2--;
            }
            insert--;
        }

    }
}
