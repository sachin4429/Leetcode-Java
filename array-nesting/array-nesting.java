class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
    int res = 0;

    for (int i = 0; i < nums.length; i++) {
      if (!visited[i]) {
        int start = nums[i];
        int count = 0;
        do {
          start = nums[start];
          count++;
          visited[start] = true;
        }
        while (start != nums[i]);
        res = Math.max(res, count);
      }
    }
    return res;
    }
}