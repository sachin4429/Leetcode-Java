class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        if((num.charAt(n-1)-'0') %2 == 1)
            return num;
        for(int i = n-1; i>=0; i--)
        {
            if((num.charAt(i)-'0') %2 == 1)
                return num.substring(0,i+1);
        }
        return "";
    }
}