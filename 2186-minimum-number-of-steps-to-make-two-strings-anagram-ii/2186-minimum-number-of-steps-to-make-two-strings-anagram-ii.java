class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(char ch : t.toCharArray())
        {
            arr[ch-'a']--;
        }
        int res = 0;
        for(int i : arr)
            res += Math.abs(i);
        return res;
    }
}