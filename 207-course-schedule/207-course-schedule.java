class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());
        int u = 0, v = 0;
        for(int itr[] : prerequisites)
        {
            adj.get(itr[0]).add(itr[1]);
        }
        int[] vis = new int[n];
        int[] dfsvis = new int[n];
        for(int i = 0; i<n; i++)
        {
            if(vis[i] == 0)
                if(checkcycle(i,adj,vis,dfsvis))
                    return false;
        }
        return true;
    }
    public boolean checkcycle(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] dfsvis)
    {
        vis[node] = 1;
        dfsvis[node] = 1;
        for(Integer it : adj.get(node))
        {
            if(vis[it] == 0)
            {
                if(checkcycle(it,adj,vis,dfsvis))
                    return true;
            }
            else if(dfsvis[it] == 1)
                return true;
        }
        dfsvis[node] = 0;
        return false;
    }
}