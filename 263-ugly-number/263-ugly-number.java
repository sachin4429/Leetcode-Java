class Solution {
    public boolean isUgly(int n) {
        int arr[] = {2, 3, 5};
        if(n<=0)
            return false;
        if(n<7)
            return true;
        for(int p : arr)
        {
            while(n%p == 0)
                n/=p;
            if(n==1)
                return true;
        }
        return false;
    }
}