class Solution {
    public int edgeScore(int[] edges) {
        Map<Integer, Long> map = new TreeMap<>();
        for(int i = 0; i<edges.length; i++)
        {
            long temp = map.getOrDefault(edges[i],0L);
            map.put(edges[i],temp+(long)i);
        }
        long max = 0; int res = -1;
        for(int i : map.keySet())
        {
            if(max<map.get(i))
            {
                max = map.get(i);
                res = i;
            }
        }
        //System.out.println(map);
        return res;
    }
}