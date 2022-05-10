class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> pre = null;
        for(int i = 0; i<numRows; i++)
        {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j<=i; j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(pre.get(j)+pre.get(j-1));
            }
                pre = row;
                ans.add(row);
        }
        return ans;
    }
}