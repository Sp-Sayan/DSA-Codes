/*
https://leetcode.com/problems/combination-sum/
 */

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        findCombination(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void findCombination(List<List<Integer>> list ,List<Integer> subList, int[] candidates, int target, int idx ){
        //base case
        if(target == 0){
            list.add(new ArrayList<>(subList));
            return;
        }

        for(int i = idx; i< candidates.length; i++){

            //if the current element < target, we continue adding the same element
            if(candidates[i] <= target){
                subList.add(candidates[i]);
                findCombination(list,subList,candidates, target - candidates[i],i);
                subList.remove(subList.size() - 1);             //backtrack
            }

        }
    }
}
