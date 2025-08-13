/*
https://leetcode.com/problems/longest-palindromic-substring/
 */


package substrings;

public class IMPORTANT_LongestPalindromic {
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;

        StringBuilder sb = new StringBuilder("");
        int len = 0;
        int maxLen = 0;

        //odd palindromes
        for(int i = 0; i<s.length();i++){
            int start = i;
            int end = i;
            while(start >=0 && end < s.length() && s.charAt(start)==s.charAt(end)){
                len = (end - start)+ 1;
                if(len > maxLen){
                    sb.delete(0,sb.length());
                    sb.append(s.substring(start, end+1));
                    maxLen = len;
                }
                start--;
                end++;
            }
        }

        //even palindromes
        for(int i = 0; i<s.length();i++){
            int start = i;
            int end = i+1;
            while(start >=0 && end < s.length() && s.charAt(start)==s.charAt(end)){
                len = (end - start)+ 1;
                if(len > maxLen){
                    sb.delete(0,sb.length());
                    sb.append(s.substring(start, end+1));
                    maxLen = len;
                }
                start--;
                end++;
            }
        }

        return sb.toString();
    }
}
