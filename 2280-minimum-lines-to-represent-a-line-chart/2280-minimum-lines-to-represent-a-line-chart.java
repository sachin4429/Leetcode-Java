class Solution {
    public int minimumLines(int[][] stockPrices) {
        if(stockPrices.length == 1)
            return 0;
        if(stockPrices.length == 2)
            return 1;
        int count = 1;
        Arrays.sort(stockPrices, (a,b) -> a[0]-b[0]);
        for(int i=1;i<stockPrices.length-1;i++){
            int x1 = stockPrices[i-1][0];
            int y1 = stockPrices[i-1][1];
            int x2 = stockPrices[i][0];
            int y2 = stockPrices[i][1];
            int x3 = stockPrices[i+1][0];
            int y3 = stockPrices[i+1][1];
            if(((x3-x2)*(y2-y1))==((y3-y2)*(x2-x1))) continue;
            
            count++;
        }
        return count;
    }
    //     double preSlope = slope(stockPrices[0][1], stockPrices[1][1], stockPrices[0][0], stockPrices[1][0]);
    //     int[] prepoint = new int[2];
    //     prepoint[0] = stockPrices[0][0];
    //     prepoint[1] = stockPrices[0][1];
    //     int res = 1;
    //     for(int i = 2; i<stockPrices.length; i++)
    //     {
    //         if(preSlope != slope(prepoint[1], stockPrices[i][1], prepoint[0], stockPrices[i][0]))
    //         {
    //             res++;
    //             prepoint[0] = stockPrices[i-1][0];
    //             prepoint[1] = stockPrices[i-1][1];
    //             preSlope = slope(prepoint[1], stockPrices[i][1], prepoint[0], stockPrices[i][0]);
    //         }
    //     }
    //     return res;
    // }
    // double slope(int y2, int y1, int x2, int x1)
    // {
    //     double y = Math.abs(y2-y1);
    //     double x = Math.abs(x2-x1);
    //     return y/x;
    // }
}