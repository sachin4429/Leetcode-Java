class Solution {
    public int subarraySum(int[] nums, int k) {
    int count = 0;
    int sum = 0;
    HashMap<Integer, Integer> hashmap = new HashMap<Integer,Integer>();
    hashmap.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (hashmap.containsKey(sum - k)) {
            count += hashmap.get(sum - k);
        }
        if (hashmap.containsKey(sum)) {
            hashmap.put(sum, hashmap.get(sum) + 1);
        } else {
            hashmap.put(sum, 1);
        }
    }
    return count;
}
}