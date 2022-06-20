class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s1 = new HashSet<>();
        for(String s : words)
            s1.add(s);
        Set<String> s2 = new HashSet<>(s1);
        for(String s : s1)
        {
            for(int i = 1; i<s.length(); i++)
            {
                s2.remove(s.substring(i));
            }
        }
        int res = 0;
        for(String s : s2)
        {
            res += s.length()+1;
        }
        return res;
    }
}