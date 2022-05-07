class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if(num<10)
            return num;
        while(num>9)
           num = num%10 + addDigits(num/10);
            
        return num;
    }
}