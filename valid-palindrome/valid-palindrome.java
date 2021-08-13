class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (true) {
            while(low <= high && !isValid(s, low)) {
                low++;
            }
            while (low <= high && !isValid(s, high)) {
                high--;
            }
            if (low <= high) {
                if (normalize(s.charAt(low)) != normalize(s.charAt(high))) {
                    return false;
                }
                low++;
                high--;
            } else {
                // Crossed threshold
                break;
            }
        }
        // If we get here, then it is valid
        return true;
    }
    private boolean isValid(String s, int index) {
        char c = s.charAt(index);
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    private char normalize(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c - 'A' + 'a');
        }
        return c;
    }
}