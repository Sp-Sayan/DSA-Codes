/*
https://leetcode.com/problems/group-anagrams/
 */

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        //group anagrams
        for(int i = 0; i< strs.length; i++){

            //sort the string (anagrams will be same if sorted)
            String str = "";
            String[] arr = strs[i].split("");
            Arrays.sort(arr);
            str = String.join("",arr);
            System.out.println(str);

            ArrayList<String> list = map.get(str.toString());   //fetch the sorted word

            if(list != null){
                list.add(strs[i]);
                map.put(str.toString(), list);
            } else {
                list = new ArrayList<>();
                list.add(strs[i]);      //store the sorted word as key
                map.put(str, list);
            }

        }

        return new ArrayList<>(map.values());
    }
}
