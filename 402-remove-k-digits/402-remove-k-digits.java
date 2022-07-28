class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() <= k)
            return "0";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<num.length(); i++)
        {
            while(k>0 && sb.length()>0 && sb.charAt(sb.length()-1) > num.charAt(i))
            {
                k--;
                sb.deleteCharAt(sb.length()-1);
            }
            if(!(sb.length()==0 && num.charAt(i) == '0'))
                sb.append(num.charAt(i));
        }
        while(k>0 && sb.length() != 0)
        {
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
        
        if(sb.length() == 0)
            return "0";
        else
            return sb.toString();
    }
}