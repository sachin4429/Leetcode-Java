class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int e = edges.length; 
			List<List<Integer>>adj = new LinkedList<>();
			for (int i=0; i<e+1; i++){
				adj.add(new LinkedList<>());
			}
			for (int[] edge: edges) {
				int start = edge[0], end = edge[1];
				adj.get(start).add(end);
				adj.get(end).add(start);
				if(checkForCycle(adj, start)) {
					return edge;
				}
			}
			return new int[]{};
    }
    class Node 
    {
    int first;
    int second;
        public Node(int first, int second) 
        {
            this.first = first;
            this.second = second; 
        }
    }
    public boolean checkForCycle(List<List<Integer>> adj, int s)
    {
       boolean vis[] = new boolean[adj.size()];
       Queue<Node> q =  new LinkedList<>(); //BFS
       q.add(new Node(s, -1));
       vis[s] = true;
       
       while(!q.isEmpty())
       {
           int node = q.peek().first;
           int par = q.peek().second;
           q.remove(); 
           
           for(Integer it: adj.get(node))
           {
               if(vis[it]==false)  
               {
                   q.add(new Node(it, node));
                   vis[it] = true; 
               }
        
               else if(par != it) return true;
           }
       }
       
       return false;
    }
}