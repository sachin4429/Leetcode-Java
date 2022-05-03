class Solution {
        public boolean validPalindrome(String s) {
        if (s == null ){
            return false;
        }
        
        if (s.length() == 1){
            return true;
        }
        
        int start = 0, end = s.length() - 1;
        char[] str = s.toCharArray();
        while(start < end){
            if (str[start] != str[end]){
                return checkPalindrome(start+1, end, str) || checkPalindrome(start, end-1, str);
            }
            
            start++;
            end--;
        }
        
        return true;
    }
    
    public boolean checkPalindrome(int start, int end, char[] str){
        while(start < end){
            if (str[start] != str[end]){
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}