class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder("0");
        for(char c:s.toCharArray())
        {
            if(str.equals(""))
               str =  str.append(c);
            else if(str.charAt(str.length()-1)!=c)
                str =  str.append(c);
            else
                str.deleteCharAt(str.length()-1);
        }
        str.deleteCharAt(0);
        return str.toString();
    }
}