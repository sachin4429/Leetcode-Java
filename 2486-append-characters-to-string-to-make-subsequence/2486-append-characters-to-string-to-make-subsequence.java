class Solution {
    public int appendCharacters(String s, String t) {
        char[] str = s.toCharArray();
        char[] ptr = t.toCharArray();
        int i = 0, j = 0;
        while(i<str.length && j<ptr.length)
        {
            if(str[i] == ptr[j])
            {
                i++; j++;
            }
            else
            {
                i++;
            }
        }
        return ptr.length - j;
    }
}