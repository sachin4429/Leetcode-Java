class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0, pre = 0, post = 0;
        for(String s : bank)
        {
            post = 0;
            for(char ch : s.toCharArray())
            {
                if(ch == '1')
                {
                    post++;
                }
            }
            res += post*pre;
            if(post != 0)
                pre = post;
        }
        return res;
    }
}