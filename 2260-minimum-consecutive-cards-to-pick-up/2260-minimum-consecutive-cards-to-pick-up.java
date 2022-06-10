class Solution {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        if(n<=1)
            return -1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int left = 0, right = 0, len = Integer.MAX_VALUE;
        while(right<n)
        {
            if(map.containsKey(cards[right]))
            {
                
                left = Math.max(left, map.get(cards[right])+1);
                len = Math.min(len, right-left+2);
            }
            map.put(cards[right],right);
            right++;
        }
        if(len != Integer.MAX_VALUE)
            return len;
        else
            return -1;
    }
}