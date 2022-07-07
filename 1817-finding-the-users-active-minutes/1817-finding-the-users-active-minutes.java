class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
        for(int i[] : logs)
        {
            if(!map.containsKey(i[0]))
                map.put(i[0], new HashSet<Integer>());
            map.get(i[0]).add(i[1]);
        }
        int[] res = new int[k];
        for(Map.Entry<Integer,HashSet<Integer>> entry : map.entrySet())
        {
            res[entry.getValue().size()-1]++;
        }
        return res;
    }
}