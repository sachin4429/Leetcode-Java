class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0, j=0;
        if(name.charAt(i)!=typed.charAt(j) || name.charAt(name.length()-1)!=typed.charAt(typed.length()-1))
            return false;
        while(i<name.length() && j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++; j++;
            }
            else if(name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }
            else
                return false;
        }
        if(j<typed.length() && name.charAt(name.length()-1)!=typed.charAt(j) || i < name.length())
            return false;
        return true;
    }
}