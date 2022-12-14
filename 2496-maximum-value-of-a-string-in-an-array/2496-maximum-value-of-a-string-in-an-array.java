class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for(String s : strs)
        {
            int len = s.length();
            boolean flag =false;
            for(char c : s.toCharArray())
            {
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                {
                    flag = true;
                    break;
                }
            }
            
            if(!flag)
               len = Integer.parseInt(s);   
            ans = Math.max(ans,len);
        }
        return ans;
    }
}