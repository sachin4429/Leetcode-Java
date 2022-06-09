class Solution {
public void gameOfLife(int[][] board) {
int count;
for(int i=0;i<board.length;i++)
for(int j=0;j<board[0].length;j++){
count = getone(i,j,board);
if((count<2 || count>3) && board[i][j]==1)board[i][j]=2;
else if(count==3 && board[i][j]==0)board[i][j]=3;
}
for(int i=0;i<board.length;i++){
for(int j=0;j<board[0].length;j++){
if(board[i][j]==2)board[i][j]=0;
if(board[i][j]==3)board[i][j]=1;
}
}
}

    int getone(int rowno, int colno, int[][] board){
        int count=0;
        if((colno+1)<board[0].length)if(board[rowno][colno+1]==1 || board[rowno][colno+1]==2)count++;
        if((colno-1)>=0)if(board[rowno][colno-1]==1 || board[rowno][colno-1]==2)count++;
        if((rowno+1)<board.length)if(board[rowno+1][colno]==1 || board[rowno+1][colno]==2)count++;
        if((rowno-1)>=0)if(board[rowno-1][colno]==1  || board[rowno-1][colno]==2)count++;
        if((colno-1)>=0)if((rowno-1)>=0)if(board[rowno-1][colno-1]==1  || board[rowno-1][colno-1]==2)count++;
        if((colno+1)<board[0].length)if((rowno+1)<board.length)if(board[rowno+1][colno+1]==1  || board[rowno +1][colno+1]==2)count++;
        if((rowno-1)>=0) if((colno+1)<board[0].length)if(board[rowno-1][colno+1]==1  || board[rowno-1][colno+1]==2)count++;
        if((colno-1)>=0) if((rowno+1)<board.length) if(board[rowno+1][colno-1]==1 || board[rowno+1][colno-1]==2)count++;
        return count;
    }
}