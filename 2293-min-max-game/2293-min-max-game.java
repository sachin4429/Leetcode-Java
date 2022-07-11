class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums)
            arr.add(i);
        int ind = 0;
        boolean flag = false;
        while(arr.size()>1)
        {
            ArrayList<Integer> brr = new ArrayList<>();
            flag = false;
            for(int i = 0; i<arr.size()-1; i+=2)
            {
                int temp = 0;
                if(flag == false)
                {
                    temp = Math.min(arr.get(i),arr.get(i+1));
                }
                else
                {
                    temp = Math.max(arr.get(i),arr.get(i+1));
                }
                brr.add(temp);
                flag = !flag;
            }
            arr = brr;
        }
        return (int)arr.get(0);
    }
}