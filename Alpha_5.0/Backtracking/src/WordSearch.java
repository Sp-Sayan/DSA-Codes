/*
https://leetcode.com/problems/word-search/
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {

        for(int i = 0; i<board.length;i++){
            for(int j=0; j<board[i].length;j++){

                if(word.charAt(0) == board[i][j] && findWord(board,i,j,word,0)){
                    return true;
                }

            }
        }

        return false;
    }

    private boolean findWord(char[][] board, int row, int col ,String word, int idx){

        //base case
        if(idx == word.length())
            return true;


        if(row >= board.length || row < 0 || col >= board[row].length || col < 0 || idx >= word.length() || board[row][col] == '*' || board[row][col] != word.charAt(idx)){
            //System.out.println(row + " " + col + " " + idx);
            return false;
        }



        //System.out.println("Correct "+ row + " " + col);
        char ch = board[row][col];
        board[row][col] = '*';


        boolean up = findWord(board, row-1,col,word,idx+1);
        boolean down = findWord(board, row+1,col,word,idx+1);
        boolean left = findWord(board, row,col-1,word,idx+1);
        boolean right = findWord(board, row,col+1,word,idx+1);

        // System.out.println(up +" "+ down +" "+ left +" "+ right);
        board[row][col] = ch;

        return up || down || left || right;
    }
}
