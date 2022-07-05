class Solution {
    public long countPairs(int n, int[][] edges) {
        long result = 0;
        if(edges.length == 0)
        {
            result = n;
            return result*(result-1)/2;
        }
        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());
        int u = 0, v = 0;
        for(int itr[] : edges)
        {
            adj.get(itr[0]).add(itr[1]);
            adj.get(itr[1]).add(itr[0]);
        }
        boolean[] vis = new boolean[n];
        int component = 0;
         for(int i = 0;i<n;i++) {
            if(!vis[i])
            {
                component++;
                dfs(i, vis, adj,component);
            }
        }
        for(int i = 0; i<component; i++)
        {
            //System.out.print(arr[i]+" ");
            for(int j = i+1; j<component; j++)
            {
                result += arr[i]*arr[j];
            }
        }
        return result;
    }
    long arr[] = new long[100001];
    public void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, int component) {
        //marking current node as visited
        vis[node] = true;
        arr[component-1]++;
        //getting neighbour nodes
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, component);
            }
        }
    }
}