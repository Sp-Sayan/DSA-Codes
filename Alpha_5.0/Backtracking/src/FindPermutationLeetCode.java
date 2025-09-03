/*
https://leetcode.com/problems/permutations

ALGO:

Initialize Data Structures
Create an empty list list to store all permutations.
Create a boolean array used[] of size n to track which elements are already included in the current permutation.
Call a recursive function findPermute(nums, list, [], used) with:

nums: input array
list: final result
subList: an initially empty list to hold the current permutation
used[]: initialized to all false.

Recursive Function: findPermute(nums, list, subList, used)
Base Case:
If subList.size() == nums.length:
A full permutation is formed.
Add a copy of subList to list.
Return.
Recursive Step:
Loop through all indices i from 0 to n-1.
If used[i] == false:
Mark used[i] = true.
Append nums[i] to subList.
Recurse: findPermute(nums, list, subList, used).
Backtrack:
Remove the last element from subList.
Reset used[i] = false.
Return Result
After recursion completes, list will contain all possible permutations of nums.
Return list.

 */




import java.util.ArrayList;
import java.util.List;

public class FindPermutationLeetCode {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        findPermute(nums, list, new ArrayList<>(), used);
        return list;
    }

    private void findPermute(int[] nums, List<List<Integer>> list, List<Integer> subList, boolean[] used) {
        if (subList.size() == nums.length) {
            list.add(new ArrayList<>(subList));  //new arraylist to prevent modifications from reflecting in original
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            //check if idx is used already
            if (!used[i]) {
                used[i] = true;
                subList.add(nums[i]);

                findPermute(nums, list, subList, used);

                //remove from subList
                subList.remove(subList.size() - 1); //  backtrack

                //set idx to false in order to use it after backtrack
                used[i] = false;                    //  backtrack
            }
        }
    }
}
