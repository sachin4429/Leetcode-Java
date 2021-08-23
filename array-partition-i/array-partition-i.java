class Solution {
    public int arrayPairSum(int[] nums) {
       if(nums.length == 0 || nums == null) return 0;
        /*
        int max = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i+=2){
            max += nums[i];
        }
        return max;*/
        
        //use counting sort to sort the nums to make a o(n) time complexity
        int[] exist = new int[20001];
		for (int i = 0; i < nums.length; i++) {
			exist[nums[i] + 10000]++;
		}
		int sum = 0;
		boolean odd = true;
		for (int i = 0; i < exist.length; i++) {
			while (exist[i] > 0) {
				if (odd) {
					sum += i - 10000;
				}
				odd = !odd;
				exist[i]--;
			}
		}
		return sum;
    }
}