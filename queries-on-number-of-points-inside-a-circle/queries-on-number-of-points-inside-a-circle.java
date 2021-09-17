class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
         int[] res = new int[queries.length];
        for (int i = queries.length - 1; i >= 0; i--) {
            int[] query = queries[i];

            int r2 = query[2];
            r2 *= r2;
            int cnt = 0;
            for (int[] point : points) {
                int dx = query[0] - point[0];
                int dy = query[1] - point[1];
                cnt += 1 - ((r2 - dy * dy - dx * dx) >>> 31);
            }
            res[i] = cnt;
        }

        return res;
    }
}