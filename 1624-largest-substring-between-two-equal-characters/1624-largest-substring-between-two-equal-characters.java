class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, ans = -1;
        for(char ch : s.toCharArray())
        {
            if(!map.containsKey(ch))
                map.put(ch,i);
            else
                ans = Math.max(ans, i - map.get(ch)-1);
            i++;
        }
        return ans;
    }
}