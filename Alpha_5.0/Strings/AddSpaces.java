/*
https://leetcode.com/problems/adding-spaces-to-a-string/
 */

public class AddSpaces {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder("");
        int spaceIdx = 0;

        for(int i = 0; i<s.length();i++){

            if(spaces[spaceIdx] == i){
                sb.append(" ");
                spaceIdx = (spaces.length - 1 == spaceIdx)? spaceIdx: spaceIdx+1;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
