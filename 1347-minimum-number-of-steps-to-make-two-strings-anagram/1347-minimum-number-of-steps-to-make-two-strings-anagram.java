class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray())
        {
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        int res = 0;
        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
            if(map1.containsKey(entry.getKey()))
            {
                res += Math.max(0,entry.getValue()-map1.get(entry.getKey()));
            }
            else
                res += entry.getValue();
        }
        return res;
    }
}