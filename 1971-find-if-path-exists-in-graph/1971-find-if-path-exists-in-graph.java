class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());
        int u = 0, v = 0;
        for(int itr[] : edges)
        {
            u = itr[0];
            v = itr[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            for(Integer itr : adj.get(node))
            {
                if(vis[itr] == false)
                {
                    q.add(itr);
                    vis[itr] = true;
                }
            }
        }
        return vis[destination];
    }
}