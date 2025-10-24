/*
https://leetcode.com/problems/check-knight-tour-configuration/
 */

public class CheckKnightTour {
    private boolean isValid = false;

    public boolean checkValidGrid(int[][] grid) {

        if(grid[0][0] != 0)
            return false;

        moveKnight(grid,0,0,0);
        return isValid;
    }

    private void moveKnight(int[][] grid, int row, int col, int count){

        //check if row is in limit
        if(row < 0 || row > grid.length-1){
            return;
        }

        //check if col is in limit
        if(col < 0 || col > grid.length-1){
            return;
        }

        //base case
        if((grid[row][col] == (grid.length*grid.length)-1) && count == (grid.length*grid.length)-1){
            System.out.println("Inside base case: "+row+ " " + col);
            isValid = true;
            return;
        }

        //check if count is correct in the board
        if(grid[row][col] == count){
            System.out.println(row+ " " + col);


            //move knight to 8 possible ways

            //2 top, 1 left
            moveKnight(grid, row-2, col-1, count+1);

            //2 top, 1 right
            moveKnight(grid, row-2, col+1, count+1);

            //2 left, 1 top
            moveKnight(grid, row-1, col-2, count+1);

            //2 left, 1 bottom
            moveKnight(grid, row+1, col-2, count+1);

            //2 right, 1 top
            moveKnight(grid, row-1, col+2, count+1);

            //2 right, 1 bottom
            moveKnight(grid, row+1, col+2, count+1);

            //2 down, 1 left
            moveKnight(grid, row+2, col-1, count+1);

            //2 down, 1 right
            moveKnight(grid, row+2, col+1, count+1);
        }

    }
}
