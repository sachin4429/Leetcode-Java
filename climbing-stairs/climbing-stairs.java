class Solution {
    static int arr[] = new int[46];
    public int climbStairs(int n) {
        arr[1] = 1;
        arr[2] = 2;
        if(arr[n] != 0)
        {
            return arr[n];
        }
        else 
        {
            arr[n] = climbStairs(n-1)+climbStairs(n-2);
            return arr[n];
        }
        
    }
}