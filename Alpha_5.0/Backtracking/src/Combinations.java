/*
https://leetcode.com/problems/combinations/description/
 */


import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();

        findCombination(list, new ArrayList<>() ,n, k,1);

        return list;
    }

    private void findCombination(List<List<Integer>> list,List<Integer> subList,int n, int k, int count){

        //base case
        if(subList.size() == k){
            list.add(new ArrayList<>(subList));
            return;
        }

        //divide the problem into subproblems
        for(int i = count; i<=n;i++){
            subList.add(i);
            findCombination(list, subList ,n,k, i+1);
            subList.remove(subList.size()-1);   //backtrack
        }
    }
}
