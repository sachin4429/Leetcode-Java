class Solution {

public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int cols = board[0].length;
    
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            if(word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board)){
                return true;
            }
            
        }
    }
    return false;
    
}

public boolean searchWord(int i, int j, int index, String word, char[][]board){
    
    if(word.length() == index){
        return true;
    }
    if(i<0 || i>=board.length || j<0 ||j>=board[0].length || word.charAt(index) != board[i][j]){
        return false;
    }
    board[i][j] -= 65;
    if(searchWord(i+1, j, index+1, word, board) ||
       searchWord(i-1, j, index+1, word, board) ||
       searchWord(i, j+1, index+1, word, board) ||
       searchWord(i, j-1, index+1, word, board)) {
        return true;
    }
    board[i][j] += 65;
    return false;
}
}