/*
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */

public class RemoveAllOccurences {
    public static String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder(s);
        int idx = sb.indexOf(part);
        int subLength = part.length();
        while (idx != -1) {

            // delete the substring
            sb = sb.delete(idx, idx + subLength);
            // search for new position of substring
            idx = sb.indexOf(part);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
}
