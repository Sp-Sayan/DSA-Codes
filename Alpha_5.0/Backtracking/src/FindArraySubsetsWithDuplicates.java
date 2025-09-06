/*
https://leetcode.com/problems/subsets-ii/
 */

import java.util.*;

public class FindArraySubsetsWithDuplicates {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);      // this prevents duplicate subsets
        Set<List<Integer>> list = new HashSet<>();
        findSubsets(list, new ArrayList<>(), nums, 0);
        return new ArrayList<>(list);
    }

    private void findSubsets(Set<List<Integer>> list, List<Integer> subList, int[] nums, int idx){

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
