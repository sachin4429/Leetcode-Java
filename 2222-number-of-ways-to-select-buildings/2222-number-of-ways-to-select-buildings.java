class Solution {
    public long numberOfWays(String s) {
       char ch[] = s.toCharArray();
       long ans = 0;
       long total0 = 0, total1 = 0;
       for(char i : ch)
       {
           if(i == '0')
               total0++;
           else
               total1++;
       }
       long current0 = 0, current1 = 0;
       if(ch[0] == '0')
           current0++;
       else
           current1++;
      for(int i = 1; i<ch.length; i++)
      {
          if(ch[i] == '0')
          {
              current0++;
              ans += (current1 * (total1-current1));
          }
          else
          {
              current1++;
              ans += (current0 * (total0-current0));
          }
      }
        return ans;
    }
}