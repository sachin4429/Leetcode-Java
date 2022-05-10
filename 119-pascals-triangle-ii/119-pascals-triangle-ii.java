class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<Integer>();
        long res = 1; 
        int n = r;
        for(int i =0; i<=n; i++)
        {
            if(i == 0 || i == n)
                ans.add(1);
            else
            {
                res = (res*r)/i; 
                ans.add((int)res);
                r--;
            }       
        }
        return ans;
    }
}