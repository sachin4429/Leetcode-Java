class Solution {
    public int leastInterval(char[] task, int n) {
        if(n == 0)
            return task.length;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, max = 0;
        for(char ch : task)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
                max = Math.max(max, map.get(ch));
            }
            else
            {
                map.put(ch,1);
                max = Math.max(max, map.get(ch));
            }
        }
        int ans = (max-1)*(n+1);
        for (int i : map.values())
            if(i == max)
                ans++;
        return Math.max(task.length, ans);
    }
}