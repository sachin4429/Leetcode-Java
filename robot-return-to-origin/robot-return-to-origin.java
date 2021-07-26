class Solution {
    public boolean judgeCircle(String moves) {
        int countH = 0;
        int countV = 0;
        //int countU = 0;
        //int countD = 0;
        for (char i : moves.toCharArray())
        {
            if(i=='L')
                countH++;
            else if(i=='R')
                countH--;
            else if(i=='U')
                countV++;
            else if(i=='D')
                countV--;
        }
        if(countV == 0 && countH == 0)
            return true;
        else 
            return false;
    }
}