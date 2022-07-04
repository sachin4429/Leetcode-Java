public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        while(sb.length()!=32)
            sb.append("0");
        System.out.println(sb);
        long res =  Long.parseLong(sb.toString(), 2);
        return (int)res;
    }
}