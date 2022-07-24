class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<ArrayList<Integer>, Integer> set = new HashMap<>();
        for(int i = 0; i<grid.length; i++)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j<grid.length; j++)
            {
                arr.add(grid[i][j]);
            }
            set.put(arr,set.getOrDefault(arr,0)+1);
        }
        int count = 0;
        for(int i = 0; i<grid.length; i++)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j<grid.length; j++)
            {
                arr.add(grid[j][i]);
            }
            if(set.containsKey(arr))
                count += set.get(arr);
        }
        return count;
    }
}