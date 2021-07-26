class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if(s==null || s==" ")
            return 0;
        else
        {
            s=s.trim();
            for(int i=s.length()-1; i>-1; i--)
                if(s.charAt(i) == ' ')
                    break;    
                else
                    count++;
        }
        return count;
    }
}