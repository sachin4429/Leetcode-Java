class Solution {
    public String convertToTitle(int n) {
        
         StringBuilder SB = new StringBuilder("");
        while(n>0)
        {
            n--;
            int r=n%26;
                SB=SB.append((char)(r+65));
            n/=26;
        }
        SB.reverse();
        return SB.toString();
    }
}