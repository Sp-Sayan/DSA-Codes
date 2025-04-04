/*
 *  https://leetcode.com/problems/set-matrix-zeroes/
 */

public class SetMatZero {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;

        // setting markers in first row and col
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRow = true;
                    if (j == 0)
                        firstCol = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;

                }
            }

        }

        // replacing inside elements with 0
        for (int i = 1; i < row; i++) {

            for (int j = 1; j < col; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }

        }

        // replacing first row and col with 0s
        if (firstRow) {
            for (int i = 0; i < col; i++)
                matrix[0][i] = 0;
        }

        if (firstCol) {
            for (int i = 0; i < row; i++)
                matrix[i][0] = 0;
        }

    }
}
