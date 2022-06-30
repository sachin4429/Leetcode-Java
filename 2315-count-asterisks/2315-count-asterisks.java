class Solution {
    public int countAsterisks(String s) {
        int flag = 0, res = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '|')
                flag++;
            else if(ch == '*' && flag%2 == 0)
                res++;
        }
        return res;
    }
}