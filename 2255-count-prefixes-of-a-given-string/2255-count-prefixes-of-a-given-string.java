class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for(String temp : words){
            if(temp.length() <= s.length() && s.substring(0, temp.length()).equals(temp))
                ans++;
        }
        return ans;
    }
}