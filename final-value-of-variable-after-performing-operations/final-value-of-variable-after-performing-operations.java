class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String str : operations)
        {
            if(str.equals("X++")||str.equals("++X"))
                res++;
            else if(str.equals("X--")||str.equals("--X"))
                res--;
        }
        return res;
    }
}