class Solution {
        final int MAX_COST = 1000001;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int[][][] memo = new int[m][target + 1][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j <= target; j++){
                Arrays.fill(memo[i][j], MAX_COST);
            }
        }
        
        for(int color = 1; color <= n; color++){
            if(houses[0] == color){
                // if the house has the same color, no more cost
                memo[0][1][color - 1] = 0;
            }else if(houses[0] == 0){
                // if the house is not painted, assign the corresponding cost
                memo[0][1][color - 1] = cost[0][color - 1];
            }
        }
        
        for(int house = 1; house < m; house++){
            for(int neigh = 1; neigh <= Math.min(target, house + 1); neigh++){
                for(int color = 1; color <= n; color++){
                    // if the house is already painted and the color is different, skip
                    if(houses[house] != 0 && color != houses[house]) continue;
                    int currCost = MAX_COST;
                    //Iterate over all possible color for prev
                    for(int prevColor = 1; prevColor <= n; prevColor++){
                        if(prevColor != color){
                            currCost = Math.min(currCost,
                                                memo[house-1][neigh-1][prevColor-1]);
                        }else{
                            currCost = Math.min(currCost,
                                                memo[house-1][neigh][color-1]);
                        }
                    }
                    int costToPaint = houses[house] != 0 ? 0 : cost[house][color-1];
                    memo[house][neigh][color - 1] = currCost + costToPaint;
                }
            }
        }
        int minCost = MAX_COST;
        for(int color = 1; color <= n; color++){
            minCost = Math.min(minCost, memo[m-1][target][color-1]);
        }
        return minCost == MAX_COST ? -1 : minCost;
    }
}