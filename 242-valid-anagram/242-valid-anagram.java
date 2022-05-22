class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] bool = new int[26];
        for(char ch : s.toCharArray())
        {
            bool[ch-'a']++;
        }
        for(char ch : t.toCharArray())
        {
            bool[ch-'a']--;
        }
        for(int i : bool)
        {
            if(i!=0)
                return false;
        }
        return true;
    }
}