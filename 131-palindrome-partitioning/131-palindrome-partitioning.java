class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(0, s, new ArrayList<>(), res);
        return res;
    }
    public void helper(int index, String s, List<String> path, List<List<String>> res)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i<s.length(); i++)
        {
            if(ispalindrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                helper(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s, int lo, int hi)
    {
        while(lo<hi)
        {
            if(s.charAt(lo++) != s.charAt(hi--))
                return false;
        }
        return true;
    }
}