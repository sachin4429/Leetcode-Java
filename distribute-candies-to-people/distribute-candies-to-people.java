class Solution {
  public int[] distributeCandies(int candies, int n) {
    int p = (int)(Math.sqrt(2 * candies + 0.25) - 0.5);
    int remaining = (int)(candies - (p + 1) * p * 0.5);
    int rows = p / n, cols = p % n;

    int[] d = new int[n];
    for(int i = 0; i < n; ++i) {
      // complete rows
      d[i] = (i + 1) * rows + (int)(rows * (rows - 1) * 0.5) * n;
      // cols in the last row
      if (i < cols) d[i] += i + 1 + rows * n;
    }
    // remaining candies        
    d[cols] += remaining;
    return d;
  }
}