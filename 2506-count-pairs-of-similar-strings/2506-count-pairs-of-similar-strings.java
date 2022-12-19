class Solution {
    public int similarPairs(String[] words) 
    {
        int ans = 0;
        for(int i = 0; i < words.length; i++)
        {
            HashSet<Character> set1 = getCharSet(words[i]);
            for(int j = i+1; j < words.length; j++)
            {
                HashSet<Character> set2 = getCharSet(words[j]);
                if(set1.equals(set2))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public HashSet<Character> getCharSet(String s)
    {
        HashSet<Character> set = new HashSet();
        for(char ch : s.toCharArray())
        {
            set.add(ch);
        }
        return set;
    }
}