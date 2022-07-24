class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 1)
            return true;
        long temp = 2;
        boolean flag  = true;
        while(temp <= n)
        {
            if(temp == n)
                return true;
            temp = (temp<<1);
            if(flag == true)
                temp += 1;
            flag = !flag;
        }
        return false;
    }
}