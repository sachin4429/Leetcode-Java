class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0;
        for(int i = 1; i<colors.length(); i++)
        {
           if(colors.charAt(i) == colors.charAt(i-1))
           {
                res += Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
           }
        }
        return res;
    }
}
//a a a
//2 1 3