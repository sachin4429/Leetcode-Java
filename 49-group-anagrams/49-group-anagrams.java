class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> inner = new ArrayList<String>();
        for(String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted))
            {
                inner = map.get(sorted);
                inner.add(s);
            }
            else
            {
                inner = new ArrayList<String>();
                inner.add(s);
            }
            map.put(sorted,inner);
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet())
        {
            res.add(entry.getValue());
        }
        return res;
    }
}