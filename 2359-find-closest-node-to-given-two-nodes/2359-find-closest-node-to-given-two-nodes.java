class Solution {
    private HashMap<Integer, Integer> buildMap(int[] edges, int node) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean[] visited = new boolean[edges.length];
        
        int temp = node, count = 0;
        while(temp != -1 && !visited[temp]) 
        {
            visited[temp] = true;
            map.put(temp, count);
            temp = edges[temp];
            count++;
        }
        
        return map;
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        HashMap<Integer, Integer> dist1 = buildMap(edges, node1);
        HashMap<Integer, Integer> dist2 = buildMap(edges, node2);
        //System.out.println(dist1+" "+dist2);
        
        int minDist = Integer.MAX_VALUE, ans = -1;
        for(int key: dist1.keySet()) 
        {
            if(!dist2.containsKey(key))
                continue;
            
            int d1 = dist1.get(key), d2 = dist2.get(key);

            int max = Math.max(d1, d2);
            if(max < minDist) 
            {
                minDist = max;
                ans = key;
            }
        } 
        
        return ans;
    }
}