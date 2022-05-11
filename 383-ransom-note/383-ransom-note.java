class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int alpha[] = new int[26];
        for(char ch : magazine.toCharArray())
        {
            alpha[ch-'a']++;
        }
        for(char ch : ransomNote.toCharArray())
        {
            alpha[ch-'a']--;
            if(alpha[ch-'a']<0)
                return false;
        }
        return true;
    }
}