class Solution {
    public int maximumScore(int a, int b, int c) {
        int x = Math.min(a, Math.min(b,c));
        int z = Math.max(a, Math.max(b,c));
        int y = a+b+c-x-z;
        
        if(x+y<=z) {
            return x+y;
        }
        
        // x  y  z 
        // 5  7  10
        // remove z first, and try to make x left == y left
        return z+(x+y-z)/2;           
    }
}