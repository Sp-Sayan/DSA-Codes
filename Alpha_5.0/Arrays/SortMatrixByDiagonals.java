
/*
https://leetcode.com/problems/sort-matrix-by-diagonals/
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrixByDiagonals {
    public int[][] sortMatrix(int[][] grid) {
        List<Integer> list = new ArrayList<>();

        //row wise (lower half of matrix)
        for(int i = 0; i<grid.length-1;i++){
            int row = i;
            int col = 0;

            //get the diagonal items
            list = getItems(row,col,grid);

            //sort the list
            Collections.sort(list,Collections.reverseOrder());
            //System.out.println(list);

            //reset the variables
            row = i;
            col = 0;
            int listIdx = 0;

            //set the sorted elements
            setItemsAfterSort(row,col,grid,list);
            list.clear();

        }

        //column wise (upper half of matrix)
        for(int i = 1; i<grid.length-1;i++){
            int row = 0;
            int col = i;

            list = getItems(row,col,grid);

            Collections.sort(list);
            System.out.println(list);

            row = 0;
            col = i;


            setItemsAfterSort(row,col,grid,list);
            list.clear();

        }

        return grid;

    }

    private List<Integer> getItems(int row, int col,int[][] grid){
        List<Integer> list = new ArrayList<>();

        while(row < grid.length && col < grid.length){
            list.add(grid[row][col]);
            row++;
            col++;
        }

        return list;

    }

    private void setItemsAfterSort(int row, int col, int[][] grid,List<Integer> list ){
        int listIdx = 0;
        while(row < grid.length && col < grid.length){
            grid[row][col] = list.get(listIdx++);
            row++;
            col++;
        }

    }
}
