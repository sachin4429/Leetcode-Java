class Solution {
    public int lengthOfLongestSubstring(String str) {
        StringBuilder test = new StringBuilder();
 
        // Result
        int maxLength = -1;
 
        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String ch = String.valueOf(c);
            if (test.indexOf(ch)!=-1) {
                test = new StringBuilder(test.substring(test.indexOf(ch) + 1));
            }
            test = test.append(c);
            maxLength = Math.max(test.length(), maxLength);
        }
 
        return maxLength;
    }
}