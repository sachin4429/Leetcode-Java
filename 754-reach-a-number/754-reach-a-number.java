class Solution {
   public int reachNumber(int target) {
    int n = (int) Math.ceil((-1 + Math.sqrt(1 + 8L * Math.abs(target))) / 2), d = n * (n + 1) / 2 - target;
    return n + (d & 1) * (1 + (n & 1));
}
}