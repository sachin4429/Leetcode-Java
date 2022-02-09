class Solution {
    public int findPairs(int[] nums, int k) {
      if (k < 0) {
        return 0;
      }
      Map<Integer, Integer> map = new HashMap<>();
      for (int val : nums) {
        map.put(val, map.getOrDefault(val, 0) + 1);
      }
      int numPair = 0;
      for (int val : map.keySet()) {
        int count = map.get(val);
        if (k == 0) {
          if (count >= 2) ++numPair;
        } else {
          if (map.containsKey(val + k)) ++numPair;
        }
      }
      return numPair;
    }
}