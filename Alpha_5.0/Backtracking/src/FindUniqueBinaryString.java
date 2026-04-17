/*
https://leetcode.com/problems/find-unique-binary-string/
 */

import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {
    Set<String> set = new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        //add in set & init sb
        for(String s: nums){
            set.add(s);
            sb.append("0");
        }

        return findUnique(sb,sb.length()-1);

    }

    private String findUnique(StringBuilder sb, int idx){

        if(!set.contains(sb.toString())){
            return sb.toString();
        }

        if(idx < 0)
            return null;

        //skip toggle
        String s1 = findUnique(sb, idx-1);

        //toggle char at idx to 1
        sb.deleteCharAt(idx);
        sb.insert(idx, "1");
        String s2 = findUnique(sb,idx-1);

        return (s1 == null)? s2: s1;

    }
}
