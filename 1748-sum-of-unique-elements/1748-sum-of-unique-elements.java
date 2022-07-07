class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Integer one  = 1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
        return sum;
    }
}