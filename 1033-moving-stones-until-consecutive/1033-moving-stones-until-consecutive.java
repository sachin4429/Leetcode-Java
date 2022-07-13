class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] res = new int[2];
        int min = Math.min(c,Math.min(a,b));
        int max = Math.max(c,Math.max(a,b));
        int mid = a+b+c-min-max;
        if(min+1 == mid && mid+1 == max)
            return res;
        res[1] = max-min-2;
        if(min+1 == mid || mid+1 == max || min+2 == mid || mid+2 == max)
            res[0] = 1;
        else
            res[0] = 2;
        return res;
    }
}