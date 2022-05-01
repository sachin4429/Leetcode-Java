class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(ch!= '#')
                sb.append(ch);
            else if(sb.length()>0)
                sb.deleteCharAt(sb.length()-1);
        }
        for(char ch : t.toCharArray())
        {
            if(ch!= '#')
                sb1.append(ch);
            else if(sb1.length()>0)
                sb1.deleteCharAt(sb1.length()-1);
        }
        if(sb.toString().equals(sb1.toString()))
            return true;
        else 
            return false;
    }
}