class Solution {
    private int[] uf;
    public int largestComponentSize(int[] A) {
        if(A == null || A.length == 0) return 0;
        int max = A[0];
        for(int i = 1; i < A.length; i++) max = Math.max(max, A[i]);
        this.uf = new int[max + 1];
        for(int i = 0; i < uf.length; i++) this.uf[i] = i;
        // For every number, find their factor and add to uf.
        for(int i = 0; i < A.length; i++){
            for(int j = 2; j <= (int)Math.sqrt(A[i]); j++){
                if(A[i] % j == 0){
                    union(A[i], j);
                    union(A[i], A[i] / j);
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int res = 1;
        for(int i = 0; i < A.length; i++){
            int root = find(A[i]);
            int cur = map.containsKey(root) ? map.get(root): 0;
            map.put(root, ++cur);
            res = Math.max(res, cur);
        }
        return res;
    }
    private void union(int i, int j){
        int p = find(i);
        int q = find(j);
        uf[p] = q;
    }
    private int find(int j){
        if(uf[j] != j){
            uf[j] = find(uf[j]);
        }
        return uf[j];
    }
}