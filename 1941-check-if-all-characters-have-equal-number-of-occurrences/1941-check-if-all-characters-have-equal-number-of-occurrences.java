class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int pre = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(e.getValue() != pre)
                return false;
            pre = e.getValue();
        }
        return true;
    }
}