class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count = 1, res = 0;
        for(int i = cost.length-1; i>=0; i--)
        {
            if(count%3 != 0)
                res += cost[i];
            count++;
        }
        return res;
    }
}