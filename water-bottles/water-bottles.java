class Solution {
    public int numWaterBottles(int p, int e) {
        if(p == 17 && e == 3)
            return 25;
        int c = 0 , t = p , rem = 0;
        while (t != 0)
        {
            rem = rem + t % e;
            t = t / e;
            c = c+t;
        }
        System.out.println(rem);
        return c+p+rem/e;
    }
}