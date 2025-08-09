package substrings;/*
https://leetcode.com/problems/palindromic-substrings/
 */

public class IMPORTANT_PalindromicSubstrings {
    public int countSubstrings(String s) {
        int palindromes = 0;

        for(int i =0; i< s.length();i++){


            int start = i;
            int end = i;

            //odd length palindromes
            while(start > -1 && end < s.length() && s.charAt(start) == s.charAt(end)){
                palindromes++;
                start--;
                end++;
            }

            //even length palindromes
            start = i;
            end = i+1;

            while(start > -1 && end < s.length() && s.charAt(start) == s.charAt(end)){
                palindromes++;
                start--;
                end++;
            }


        }

        return palindromes;
    }
}
