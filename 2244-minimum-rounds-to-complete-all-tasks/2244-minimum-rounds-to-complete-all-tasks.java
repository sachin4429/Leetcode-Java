class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : tasks)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int res = 0;
        for(Integer itr : map.values())
        {
            if(itr<2)
                return -1;
            else
            {
                if(itr%3 == 0)
                    res += itr/3;
                else if(itr%3 == 1)
                    res += (itr-4)/3+2;
                else if(itr%3 == 2)
                {
                    res += itr/3;
                    res++;
                }
            } 
        }
        return res;
    }
}