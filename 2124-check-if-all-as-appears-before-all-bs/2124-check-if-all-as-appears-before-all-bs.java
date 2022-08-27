class Solution {
    public boolean checkString(String s) {
        int first = 0;
        int last = s.length()-1;
        for(int i = 0; i< s.length(); i++)
        {
            if(s.charAt(i) == 'a')
                first = i;
        }
        for(int i = s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == 'b')
                last = i;
        }
        if(first <= last)
            return true;
        else
            return false;
    }
}