class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> map.get(a)-map.get(b) == 0 ? b-a : map.get(a)-map.get(b));
        for(int i : map.keySet())
        {
            q.add(i);
        }
        int ind = 0;
        while(!q.isEmpty())
        {
            int itr = q.poll();
            for(int i = 0; i<map.get(itr); i++)
            {
                nums[ind++] = itr;
            }
        }
        
        return nums;
    }
}