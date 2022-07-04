class Solution {
    public int firstUniqChar(String s) {
        for(char ch : s.toCharArray())
        {
            if(s.indexOf(ch)==s.lastIndexOf(ch))
                return s.indexOf(ch);
        }
        return -1;
    }
}