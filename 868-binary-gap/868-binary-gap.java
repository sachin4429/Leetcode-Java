class Solution {
    public int binaryGap(int n) {
        int res = 0;
        char ch[] = Integer.toString(n,2).toCharArray();
        int i = 0;
        while(i<ch.length && ch[i] != '1')
            i++;
        if(i >=  ch.length-1)
            return 0;
        int count = 0;
        for(int j = i+1; j<ch.length; j++)
        {
            if(ch[j] == '0')
                count++;
            else
            {
                res = Math.max(res, count+1);
                count = 0;
            }
        }
        return res;
    }
}