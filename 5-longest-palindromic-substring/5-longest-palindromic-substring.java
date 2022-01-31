class Solution {
    int max =0;
    String str = "";
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        
        for(int i=0;i<s.length();i++)
        {
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return str;
    }
    void expand(String s , int left, int right)
    {
        if(left>right) return ;
        while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right))
        {
            left--;
            right++;
        }
        
        int size = right - left - 1;
         if(size>max)
         {
             str = s.substring(left+1, right);
             max = size;
         }
    }
}