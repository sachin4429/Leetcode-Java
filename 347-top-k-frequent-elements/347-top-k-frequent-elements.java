class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> map.get(b)-map.get(a));
        for(int i : map.keySet())
        {
            q.add(i);
        }
        int[] ans = new int [k];
        for(int i = 0; i<k; i++)
            ans[i] = q.poll();
        
        return ans;
    }
}