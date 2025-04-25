/*
 *  https://www.geeksforgeeks.org/problems/shortest-direction4201/1
 */

import java.util.*;

public class ShortestDirection {
    static String shortestPath(String S) {
        // your code here
        int x = 0;
        int y = 0;
        String word = "";

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == 'N')
                y++;
            if (ch == 'S')
                y--;
            if (ch == 'E')
                x++;
            if (ch == 'W')
                x--;

        }

        while (x != 0) {

            if (x > 0) {
                word += "E";
                x--;
            } else {
                word += "W";
                x++;
            }

        }
        while (y != 0) {

            if (y > 0) {
                word += "N";
                y--;
            } else {
                word += "S";
                y++;
            }

        }

        // sort word
        String[] arr = word.split("");
        Arrays.sort(arr);
        word = String.join("", arr);

        return word;
    }

    public static void main(String[] args) {
        System.out.println("Shortest distance for provided path: " + shortestPath("SSSNEEEW"));
    }
}
