class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index = -1;
 
        for (char i : s.toCharArray())
            if((index = t.indexOf(i, index + 1)) == -1)
                return false;
    
        return true;
    }
}