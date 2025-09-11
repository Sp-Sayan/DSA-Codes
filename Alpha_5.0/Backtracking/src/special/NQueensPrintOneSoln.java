package special;

public class NQueensPrintOneSoln {
    public static void main(String[] args) {
        int n = 2;
        char[][] chessBoard = new char[n][n];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = 'x';
            }
        }

        if(!nQueens(chessBoard, 0)){
            System.out.println("No solution exists");
        }
    }

    private static boolean nQueens(char[][] chessBoard, int row) {

        if(row == chessBoard.length){
            printBoard(chessBoard);
            return true;
        }

        for (int col = 0; col < chessBoard[row].length; col++) {

            if(isSafe(chessBoard, row, col)){
                //place queen
                chessBoard[row][col] = 'Q';
                //recursively call for the next row
                if(nQueens(chessBoard,row+1))
                    return true;
                //backtrack to remove queen
                chessBoard[row][col] = 'x';
            }
        }
        return false;
    }

    private static void printBoard(char[][] chessBoard) {
        System.out.println("---------Chess Board---------");
        for (int i = 0; i < chessBoard.length; i++) {

            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(char[][] chessBoard, int row, int col) {

        //vertical up
        for(int i = row - 1; i >= 0 ; i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i = row-1, j = col+1; i >= 0 && j < chessBoard.length; i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }
}
