class Solution {
    public String convertToBase7(int num) {
         String result = "";  
        int flag = 0;  
        if (num < 0) {  
            flag = 1;  
            num = Math.abs(num);  
        }  
        while(num >= 7) {  
            result = num % 7 + result;  
            num = num / 7;  
        }  
        result = num + result;  
        if (flag == 1)  
            result = "-" + result;  
        return result;  
    }
}