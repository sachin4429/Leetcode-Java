class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences)
        {
            String[] s = str.split(" ");
            max = Math.max(max, s.length);
        }
        return max;
    }
}