class Solution {
    public int lengthOfLongestSubstring(String str) {
        StringBuilder test = new StringBuilder();
        int maxLength = -1;
        if (str.isEmpty()) {
            return 0;
        }
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