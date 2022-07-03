class Solution {
    public int countHousePlacements(int n) {
        if(n == 1)
            return 4;
        else if(n == 2)
            return 9;
        int arr[] = new int[n+1];
        arr[1] = 2;
        arr[2] = 3;
        long temp = fib(n,arr);
        temp = (temp*temp)%1000000007;
        return (int)temp;
    }
    public int fib(int n, int[] arr)
    {
        if(arr[n] != 0)
        {
            return arr[n];
        }
        else
        {
            arr[n] = (fib(n-1,arr)+fib(n-2,arr))%1000000007;
            return arr[n];
        }
    }
}