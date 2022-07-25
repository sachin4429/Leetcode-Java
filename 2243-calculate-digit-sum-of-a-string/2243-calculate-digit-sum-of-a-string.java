class Solution {
    String str = "";
    public String digitSum(String s, int k) {
         str = s;
         helper(str, k);
        return str;
    }
    public void helper(String s, int k) {
        if(s.length()<=k)
            return;
        String temp = "";
        int i = 0;
        for(i = 0; i<s.length()-k; i+=k)
        {
            temp += sum(s.substring(i,i+k));
        }
        temp += sum(s.substring(i));
        if(temp.length() <= k)
        {
            str = temp;
            return;
        }
        helper(temp, k);
    }
    public String sum(String s)
    {
        int res = 0;
        for(char ch : s.toCharArray())
        {
            res += ch-'0';
        }
        return res+"";
    }
}