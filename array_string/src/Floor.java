/*
Find floor of TARGET element from array
ceiling = smallest element <= target
 */


public class Floor {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr,0));
    }

    public static int floor(int[] nums, int target){

        int ll = 0;
        int ul = nums.length - 1;
        int mid = ll + (ul-ll)/2;

        while(ll <= ul){

            if(target > nums[mid])
                ll = mid+1;
            else if(target < nums[mid])
                ul = mid -1;
            else
                return nums[mid];

            mid = (ul+ll)/2;
        }

        if(nums[mid] < target || mid == 0)
            return nums[mid];
        else
            return nums[mid-1];




    }
}
