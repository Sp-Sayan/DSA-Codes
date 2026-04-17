/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left=0,right=0,maxLen = 0;

        while(right< s.length()){
            char x = s.charAt(right);

            //if present
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            //if char not present in window
            if(!set.contains(x)){
                set.add(x);
                maxLen = Math.max(maxLen, right-left +1);
            }
            right++;
        }

        return maxLen;

    }
}
