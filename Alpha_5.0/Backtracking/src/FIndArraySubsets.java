/*
https://leetcode.com/problems/subsets/
 */


import java.util.ArrayList;
import java.util.List;

public class FIndArraySubsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findSubsets(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void findSubsets(List<List<Integer>> list, List<Integer> subList, int[] nums, int idx){

        //base case
        if(idx == nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }

        //idx says NO
        findSubsets(list,subList,nums,idx+1);

        //idx says YES
        subList.add(nums[idx]);
        findSubsets(list,subList,nums,idx+1);

        //remove item
        subList.remove(subList.size()-1);
    }
}
