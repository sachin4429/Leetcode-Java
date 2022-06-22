class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        PriorityQueue<Character> q = new PriorityQueue<Character>((a,b)-> map.get(b)-map.get(a));
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : map.keySet())
        {
            q.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty())
        {
            char ch = q.poll();
            for(int i = 0; i<map.get(ch); i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}