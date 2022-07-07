class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i = 0; i<groupSizes.length; i++)
        {
            if(!map.containsKey(groupSizes[i]))
                map.put(groupSizes[i], new ArrayList<Integer>());
            map.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet())
        {
            if(entry.getValue().size() == entry.getKey())
            {
                ans.add(entry.getValue());
            }
            else
                {
                    List<Integer> arr = new ArrayList<Integer>();
                    List<Integer> pre = entry.getValue();
                    int size = entry.getKey();
                    for(int i=0; i<pre.size(); i++)
                    {
                        arr.add(pre.get(i));
                        if((i+1)%size == 0)
                        {
                            ans.add(arr);
                            arr = new ArrayList<Integer>();
                        }
                    }
                }
        }
               return ans;
    }
}