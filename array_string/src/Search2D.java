/*
You are given an m x n integer matrix  with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */


public class Search2D {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,13));
    }



    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        int targetRow = -1;
        //SEARCH FOR VALID ROW
        for(int i =0; i<matrix.length;i++){
            if(target < matrix[i][matrix[i].length - 1]){
                targetRow = i;
                //System.out.println(i);
                int ll = 0;
                int ul = matrix[targetRow].length - 1;
                int mid = ll + (ul-ll)/2;
                //System.out.println(mid);
                //APPLY BINARY SEARCH

                    while(ll<=ul){
                        if(target < matrix[targetRow][mid])
                            ul = mid -1;
                        else if(target > matrix[targetRow][mid])
                            ll = mid + 1;
                        else{
                            System.out.println("hi");
                            found = true;
                            break;
                        }
                        mid = (ul+ll)/2;
                        //System.out.println(mid);

                    }

                break;
            }
        }


        return found;

    }
}
