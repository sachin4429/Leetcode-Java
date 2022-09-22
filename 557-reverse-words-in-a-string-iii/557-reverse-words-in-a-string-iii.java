class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        StringBuilder ptr = new StringBuilder();
        int j = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                StringBuilder str = new StringBuilder(s.substring(j,i));
                j = i+1;
                str.reverse();
                ptr.append(str.toString() + " ");
            }
        }
        ptr.deleteCharAt( ptr.length() - 1 );
        return ptr.toString();
    }
}