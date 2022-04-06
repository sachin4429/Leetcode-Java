class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length, w = amount;
        int t[][] = new int[n+1][w+1];
        for(int i = 0; i<w+1; i++)
        {
            t[0][i] = Integer.MAX_VALUE-1;
        }
        for(int j = 1; j<w+1; j++)
        {
            if(j%coins[0] == 0)
                t[1][j] = j/coins[0];
            else
                t[1][j] = Integer.MAX_VALUE-1;
        }
        for(int i = 2; i<n+1; i++)
        {
            for(int j = 1; j<w+1; j++)
            {
                if(coins[i-1]<=j)
                    t[i][j] = Math.min(1+t[i][(j-coins[i-1])], t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }
        if(t[n][w]<Integer.MAX_VALUE-1)
            return t[n][w];
        else
            return -1;
    }
}