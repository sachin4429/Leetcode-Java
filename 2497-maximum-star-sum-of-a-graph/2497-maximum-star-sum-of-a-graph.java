class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int res = vals[0];
        if (k == 0) { // corner case
            for (var x : vals) res = Math.max(res, x);
            return res;
        }

        // create graph
        int n = vals.length;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (var e : edges) {
            if (vals[e[1]] > 0) g[e[0]].add(vals[e[1]]);
            if (vals[e[0]] > 0) g[e[1]].add(vals[e[0]]);
        }

        for (int i = 0; i < n; i++) res = Math.max(res, topK(g[i], vals[i], k));
        return res;
    }

    private int topK(List<Integer> l, int res, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int x : l) {
            if (q.size() < k) q.offer(x);
            else if (x > q.peek()) {
                q.poll();
                q.offer(x);
            }
        }

        while (!q.isEmpty()) res += q.poll();

        return res;
    }
}