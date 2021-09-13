public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(sb +" "+ n);
        if(sb.length() == 0)
            return 0;
        int i = 0, count = 0;
        while(i<sb.length())
        {
            if(sb.charAt(i)=='1')
            count++;
            i++;
        }
    return count;
    }
}