class Solution {
    public boolean isBipartite(int[][] graph) {
        int n= graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int k = 0;
        for(int[] itr : graph)
        {
            for(int j=0;j<itr.length;j++)
            {
                adj.get(k).add(itr[j]);
            }
            k++;
        }
        int[] color = new int[n];
        Arrays.fill(color,-1);
        for(int i = 0; i<n; i++)
        {
            if(color[i] == -1)
            {
                if(!bfscheck(adj,i,color))
                    return false;
            }
        }
        return true;
    }
    boolean bfscheck( ArrayList<ArrayList<Integer>> adj, int node, int[] color)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
         while(!q.isEmpty())
        {
            Integer nde = q.poll();
            for(Integer itr : adj.get(nde))
            {
                if(color[itr] == -1)
                {
                    color[itr] = 1- color[nde];
                    q.add(itr);
                }
                else if(color[itr] == color[nde])
                    return false;
            }
        }
        return true;
    }
}