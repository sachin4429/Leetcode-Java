class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxfreq = 0, res = 0;
        for(int i = 0; i<edges.length; i++)
        {
            for(int j = 0; j<edges[0].length; j++)
            {
                int node = edges[i][j];
                if(map.containsKey(node))
                {
                    int freq = map.get(node);
                    if(freq>maxfreq)
                    {
                        maxfreq = freq;
                        res = node;
                    }
                    map.put(node,freq+1);
                }
                else
                    map.put(node,1);
            }
        }
        return res;
    }
}