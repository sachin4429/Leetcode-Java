class Solution {
    public int minEatingSpeed(int[] piles, int H) {
           int left = 1, right =Arrays.stream(piles).max().getAsInt();
        while (left < right) {
            int mid = (left + right) / 2, total = 0;
            for (int p : piles) total += (p + mid - 1) / mid;
            if (total > H) left = mid + 1; else right = mid;
        }
        return left;
    }
}