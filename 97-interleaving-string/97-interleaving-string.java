class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1+l2 != l3)
            return false;
        return check(s1, s2, s3, l1, l2, l3, 0, 0, 0);
    }
    public boolean check(String s1, String s2, String s3, int l1, int l2, int l3, int p1, int p2, int p3)
    {
        if(p3 == l3)
            return (p1 == l1 && p2 == l2) ? true : false;
        String key = p1+"*"+p2+"*"+p3;
        if(map.containsKey(key))
            return map.get(key);
        
        if(p1 == l1)
        {   
            map.put(key, s2.charAt(p2) == s3.charAt(p3)? check(s1, s2, s3, l1, l2, l3, p1, p2+1, p3+1):false);
            return map.get(key);
        }
        if(p2 == l2)
        {
            map.put(key, s1.charAt(p1) == s3.charAt(p3)? check(s1, s2, s3, l1, l2, l3, p1+1, p2, p3+1):false);
            return map.get(key);
        }
        boolean one = false, two = false;
        if(s1.charAt(p1) == s3.charAt(p3))
            one = check(s1, s2, s3, l1, l2, l3, p1+1, p2, p3+1);
        if(s2.charAt(p2) == s3.charAt(p3))
            two = check(s1, s2, s3, l1, l2, l3, p1, p2+1, p3+1);
        
        map.put(key, one||two);
        return map.get(key);
    }
}