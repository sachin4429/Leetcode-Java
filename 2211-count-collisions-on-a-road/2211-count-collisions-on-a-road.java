class Solution {
    public int countCollisions(String directions) {
        int l = 0;
        char[] ch = directions.toCharArray();
        for(int i = 0; i<ch.length; i++)
        {
            if(ch[i] == 'L')
                l++;
            else break;
        }
        int r = ch.length-1;
        for(int i = ch.length-1; i>=0; i--)
        {
            if(ch[i] == 'R')
                r--;
            else break;
        }
        int count = 0;
        for(int i = l; i<=r; i++)
        {
            if(ch[i] != 'S')
                count++;
        }
        return count;
    }
}