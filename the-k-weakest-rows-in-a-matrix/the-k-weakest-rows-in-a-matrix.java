class Solution {
    public int[] kWeakestRows(int[][] M, int K) {
        int y = M.length, x = M[0].length, kix = 0;
        int[] vis = new int[y], ans = new int[K];
        for (int j = 0; j <= x; j++)
            for (int i = 0; i < y; i++) {
                if (vis[i] == 0 && (j == x || M[i][j] == 0)) {
                    ans[kix++] = i;
                    vis[i]++;
                }
                if (kix == K) return ans;
            }
        return ans;
    }
}