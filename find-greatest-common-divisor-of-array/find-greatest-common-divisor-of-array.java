class Solution {
    int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i : nums)
        {
            if(i<min)
                min = i;
            if(i>max)
                max = i;
        }
        return gcd(min,max);
    }
}