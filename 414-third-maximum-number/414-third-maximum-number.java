class Solution {
    public int thirdMax(int[] x) {
         long first = Long.MIN_VALUE, second=Long.MIN_VALUE, third = Long.MIN_VALUE;
        for(int i : x)
        {
            if(i>first)
            {
                third = second;
                second = first;
                first = i;
            }
            else if(i>second && i!=first)
            {
                third = second;
                second = i;
            }
            else if(i>third && i!=first && i!=second)
            {
                third = i;
            }
        }
        return third != Long.MIN_VALUE ? (int)third : (int)first;
    }
}