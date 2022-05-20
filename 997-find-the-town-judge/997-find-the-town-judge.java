class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] dp = new boolean[n + 1];
        int[] arr = new int[n + 1];
        dp[0] = true;
        
        for (int[] x : trust){
            dp[x[0]] = true;
            arr[x[1]]++;
        }
        
        for (int i = 0; i <= n; i++)
            if (!dp[i] && arr[i] == n - 1)
                return i;
        return -1;
    }
}