class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
    if(k<=1) return n;
    if(n < k || n == 0) return 0;

    Map<Character,Integer> map = new HashMap<>();
    
    for(char c : s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    
    int j = 0;
    while(j<n && map.get(s.charAt(j)) >= k) j++;
    if(j > n-1) return j;
    
    int list1 = longestSubstring(s.substring(0,j) , k);
    
    while(j < n && map.get(s.charAt(j))< k) j++;
    int list2 =(j<n)? longestSubstring(s.substring(j),k) : 0;
    
    return Math.max(list1,list2);
    }
}