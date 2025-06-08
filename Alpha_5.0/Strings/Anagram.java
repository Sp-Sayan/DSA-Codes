/*
 * https://leetcode.com/problems/valid-anagram/
 */
class Anagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < t.length(); i++) {

            Character ch = t.charAt(i);

            // search for index
            int index = sb.indexOf(ch.toString());

            if (index == -1)
                return false;

            sb.deleteCharAt(index);
        }

        return true;
    }
}