class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> w =new TreeMap<Integer, Integer>();
        Map<Integer, Integer> l =new TreeMap<Integer, Integer>();
        for(int i[] : matches)
        {
            w.put(i[0], w.getOrDefault(i[0],0)+1);
            l.put(i[1], l.getOrDefault(i[1],0)+1);
        }
        List<Integer> win = new ArrayList<Integer>();
        List<Integer> win1 = new ArrayList<Integer>();
        for(Integer i : w.keySet())
        {
           if(!l.containsKey(i))
               win.add(i);
        }
        for(Integer i : l.keySet())
        {
           if(l.get(i) == 1)
                win1.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(win);
        ans.add(win1);
        return ans;
    }
}