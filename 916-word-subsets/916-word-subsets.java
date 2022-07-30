class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int count[] = new int[26];
        int temp[];
        int i = 0;
        for(String s : words2)
        {
            temp = counter(s);
            for(i = 0; i<26; i++)
                count[i] = Math.max(count[i],temp[i]);
        }
        List<String> res = new ArrayList<>();
        for (String s : words1) 
        {
            temp = counter(s);
            for (i = 0; i < 26; ++i)
                if (temp[i] < count[i])
                    break;
            if (i == 26) res.add(s);
        }
        return res;
            
        
    }
    public int[] counter(String words)
    {
        int count[] = new int[26];
        for(char c : words.toCharArray())
            count[c-'a']++;
        return count;
    }
}