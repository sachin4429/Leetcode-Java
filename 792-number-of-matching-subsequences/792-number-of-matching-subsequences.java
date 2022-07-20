class Solution {
    char[] arr;
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String word : words)
        {
            hm.put(word, hm.getOrDefault(word,0)+1);
        }
        arr = s.toCharArray();
        int res = 0;
        for(Map.Entry<String,Integer> map : hm.entrySet())
        {
            if(isMatching(map.getKey().toCharArray()))
                res += map.getValue();
        }
        return res;
    }
    public boolean isMatching(char[] sub)
    {
        int n = sub.length, m = arr.length;
        int j = 0;
        for(int i = 0; i<m && j<n; i++)
        {
            if(sub[j] == arr[i])
                j++;
        }
        return (j == n);
    }
}