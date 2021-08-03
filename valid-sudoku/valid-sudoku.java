class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet s =new HashSet();
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    if(board[i][j]!='.')
                    {
                        if(!s.add("r"+i+board[i][j])||!s.add("c"+j+board[i][j])||!s.add("b"+(i/3)*3+j/3+board[i][j]))
                            return false;
                            
                    }
                }
            }
        return true;
    }
}