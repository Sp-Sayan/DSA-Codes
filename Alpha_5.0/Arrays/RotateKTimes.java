// [1,2,3,4,5,6,7]
// Step 1 - [7 6 5 4 3 2 1] // reverse full
// Step 2 - [5 6 7 4 3 2 1] // reverse 0 to k-1
//Step 3 - [5 6 7 1 2 3 4] //reverse k to len -1
public class RotateKTimes {
    public void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;

        k = k % nums.length;

        //reverse
        reverseArr(nums,start,end);

        //reverse parts

        //reverse first half
        start = 0;
        end = k-1;
        reverseArr(nums, start,end);

        //reverse 2nd part
        start = k;
        end = nums.length-1;
        reverseArr(nums,start,end);



    }

    public void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; end--;
        }
    }
}
