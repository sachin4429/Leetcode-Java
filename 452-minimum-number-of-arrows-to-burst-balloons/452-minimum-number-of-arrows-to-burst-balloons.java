class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[0],b[0]));
        int res = 0 , minEnd = Integer.MAX_VALUE;
         for(int k[] : points)
         {
             if(k[0] > minEnd)
             {
                 res++;
                 minEnd = k[1];
             }
             else
                 minEnd = Math.min(minEnd, k[1]);
         }
        return res+1;
    }
}