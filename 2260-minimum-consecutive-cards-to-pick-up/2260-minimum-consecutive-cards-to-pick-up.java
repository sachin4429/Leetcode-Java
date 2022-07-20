class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0; i<cards.length; i++)
        {
            if(!map.containsKey(cards[i]))
                map.put(cards[i],i);
            else
            {
                flag = true;
                res = Math.min(res, i-map.get(cards[i])+1);
                map.put(cards[i],i);
            }
        }
        if(flag)
            return res;
        else
            return -1;
    }
}