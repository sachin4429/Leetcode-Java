class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int w = amount;
        int t[][] = new int [n+1][w+1];
        for(int i = 0; i<n+1; i++)
            t[i][0] = 1;
        for(int i = 1; i<n+1; i++)
            for(int j = 1; j<w+1; j++)
            {
                if(coins[i-1]<=j)
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        return t[n][w];
    }
}