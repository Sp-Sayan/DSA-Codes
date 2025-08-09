package substrings;

/*
https://leetcode.com/problems/fruit-into-baskets/

USE THIS TEST CASE TO UNDERSTAND THE QUESTION:
[1,2,3,2,2,4,4,4]
 */


import java.util.HashSet;
import java.util.Set;

public class IMPORTANT_FruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int count = 0;
        int idx = 0;
        Set<Integer> distinct = new HashSet<>();
        // distinct.add(fruits[0]);

        while(idx < fruits.length){
            //add the element
            distinct.add(fruits[idx]);

            //check if no of distinct is at max 2
            if(distinct.size() < 3){
                count++;

            }else{
                //clear the set
                distinct.clear();
                count = 0;
                int prev = --idx;
                //continue until the same element is found
                //the idx stops at index 1 less than required
                while(fruits[idx] == fruits[prev])
                    idx--;

            }

            //check if no. of fruits this time is greater
            maxFruits = (maxFruits >= count)?maxFruits: count;

            idx++;
        }


        return maxFruits;


    }
}
