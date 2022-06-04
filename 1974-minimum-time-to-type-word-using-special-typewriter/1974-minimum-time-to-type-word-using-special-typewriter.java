class Solution {
    public int minTimeToType(String word) {
        char curr = 'a';
        int time = 0;
        for(char ch : word.toCharArray())
        {
            if(curr == ch)
            {
                time++;
            }
            else
            {
               int currpos = (int)curr;
               int despos = (int)ch;
               int clock = Math.abs(curr-ch);
               int anti = 26 - clock;
               time += Math.min(clock, anti)+1;
               curr = ch;
            }
        }
        return time;
    }
}