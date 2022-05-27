class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles == 0)
            return target-1;
        int count = 0;
        while(maxDoubles != 0 && target !=1)
        {
            if(target%2 == 0)
            {
                target /= 2;
                maxDoubles--;
                count++;
            }
            else
            {
                target--;
                count++;
            }
        }
        if(target != 1)
        {
            return target-1+count;
        }
        return count;
    }
}