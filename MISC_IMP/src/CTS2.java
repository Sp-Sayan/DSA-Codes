/*
You are given an array A of size N, where each element represents the number of steps you can take from a room in a maze. An integer S represents the index of your starting room.

*) Below are the rules of the maze: You should start at S and always move right first, by the number of steps specified at the current index.Then take alternate direction (right -> left -> right -> ...).

*) If a move takes you out of bounds (i.e., index becomes < 0 or >= N), you return the value at the current index where you were before attempting the move.

*) If you visit the current room again, a loop is detected. Your task is to find and return an integer value representing the unreachable value at the current index, if movement goes out of bounds or -1, if a loop is detected
 */

import java.util.HashSet;
import java.util.Set;

public class CTS2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        System.out.println(findSteps(arr,0));;
    }

    private static int findSteps(int[] arr, int start) {
        Set<Integer> visited = new HashSet<>();
        boolean loopDetected = false;
        int direction = 1;
        int lastIdx = -1;

        while(true){
            //check the current index
            if(visited.contains(start)){
                break;
            }
            if (start < 0 || start >= arr.length ) {
                return arr[lastIdx];
            }

            //new idx
            lastIdx = start;
            start = start + (direction * arr[start]);
            direction *= -1;
            visited.add(lastIdx);
        }

        return -1;
    }
}
