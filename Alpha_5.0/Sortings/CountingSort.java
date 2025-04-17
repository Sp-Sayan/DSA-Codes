public class CountingSort {

    private static void countingSort(int[] nums) {
        int max = Integer.MIN_VALUE;

        // find max value
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        // create aux array
        int[] count = new int[max + 1];

        // frequency
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // place it in original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j++] = i;
                count[i]--;
            }
        }
    }

    private static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        countingSort(arr);
        display(arr);
    }
}
