class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int [][] result = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++){
                if(j+k >= grid[i].length) {
                    int x = (i+ (j+k) / grid[i].length) % grid.length;
                    int y = (j+k) % grid[i].length;
                    result[x][y] = grid[i][j];
                }
                else
                result[i][j+k] = grid[i][j];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < result.length; i++) {
            list.add(new ArrayList<>());
            for(int j = 0; j < result[i].length; j++) {
                list.get(i).add(result[i][j]);
            }
        }
        
        return list;
    }
}