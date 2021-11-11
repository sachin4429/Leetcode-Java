class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            startValue = Math.max(startValue, 1 - sum);
        }
        return startValue;
    }
}
