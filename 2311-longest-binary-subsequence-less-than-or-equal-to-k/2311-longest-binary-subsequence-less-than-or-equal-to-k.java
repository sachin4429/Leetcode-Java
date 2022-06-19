class Solution {
    public int longestSubsequence(String s, int k) {
        int j = 0;
        int sum = 0;
        boolean stop = false;
        int ans = 0;
        for(int i = s.length()-1; i>=0 ;i--)
        {
            if(s.charAt(i) == '0')
                ans++;
            else if(stop == false && j<31)
            {
                sum += Math.pow(2,j);
                if(sum>k)
                {
                    stop = true;
                    sum -= Math.pow(2,j);
                }
                else
                {
                    ans++;
                }
            }
            j++;
        }
        return ans;
    }
}