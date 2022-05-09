class Solution {
    static HashMap<String, Boolean> mp = new HashMap<>();
    public boolean isScramble(String a, String b) {
        if(a.length() != b.length())
            return false;
        if(a.equals(b))
            return true;
        if(a.length()<=1)
            return false;
        int n = a.length();
        String sb = a+b;
        if(mp.containsKey(sb))
           return mp.get(sb);
        boolean flag = false;
        for(int i = 1; i<n; i++)
        {
            if(isScramble(a.substring(0,i),b.substring(n-i)) 
               && isScramble(a.substring(i),b.substring(0,n-i)) ||
               isScramble(a.substring(0,i),b.substring(0,i)) 
               && isScramble(a.substring(i),b.substring(i))
              )
            {
                flag = true;
                break;
            }
        }
        mp.put(sb,flag);
        return flag;
    }
}