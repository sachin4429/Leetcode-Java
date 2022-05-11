class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxpro = 0;
        for(int i : prices)
        {
            min = Math.min(min, i);
            maxpro = Math.max(maxpro,i-min);
        }
        return maxpro;
    }
}