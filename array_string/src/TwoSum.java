import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> myMap = new HashMap<>();
        int i;
        int[] pair = new int[2];
        for(i=0;i<nums.length;i++){
            Integer key = myMap.get(nums[i]);
            if(key != null){
                pair[0] = i;
                pair[1] = key;
                break;
            }
            myMap.put(target-nums[i],i);
        }

        return pair;


    }
}


