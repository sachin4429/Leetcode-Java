class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i<senders.length; i++)
        {
            String str = senders[i];
            String ptr = messages[i];
            int spaceCount = 0;
            for(int j = 0; j<ptr.length(); j++)
                if(ptr.charAt(j) == ' ')
                    spaceCount++;
            map.put(str, map.getOrDefault(str, 0)+spaceCount+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<String>((a,b) -> map.get(b)-map.get(a));
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            pq.add(entry.getKey());
        }
        String res = pq.poll();
        if(pq.isEmpty())
            return res;
        if(map.get(res) != map.get(pq.peek()))
            return res;
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(res);
        while(!pq.isEmpty() && map.get(res) == map.get(pq.peek()))
            arr.add(pq.poll());
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}