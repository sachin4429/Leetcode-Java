class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for(String s : words)
        {
            for(int i = 1; i<s.length(); i++)
            {
                set.remove(s.substring(i));
            }
        }
        int res = 0;
        for(String s : set)
        {
            res += s.length()+1;
        }
        return res;
    }
}