class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	int n = nums.length;
	if(n<4)
		return res;
	for(int i = 0; i<n-3; i++)
	{
		for(int j = i+1; j<n-2; j++)
		{
			int remain = target - nums[i]-nums[j];
			int lo =j+1, hi = n-1;
			while(lo<hi)
			{
			    List<Integer> innerres = new ArrayList<Integer>();   
                    
				if(nums[lo]+nums[hi] == remain)
				{
					innerres.add(nums[i]);
					innerres.add(nums[j]);
 					innerres.add(nums[lo]);
					innerres.add(nums[hi]);
                    while(lo<hi && innerres.get(2) == nums[lo])
                        lo++; 
                    while(lo<hi && innerres.get(3) == nums[hi])
                        hi--;
                    
                    res.add(innerres);
				}
				else if(nums[lo]+nums[hi] < remain)
				{
					lo++;
				}
				else 
				{
					hi--;
				}
        	}
            while(j + 1 < n && nums[j+1] == nums[j])
                j++;
        }
        while(i + 1 < n && nums[i+1] == nums[i])
                i++;
    }
        return res;
}
}




// class Solution {
//         public List<List<Integer>> fourSum(int[] num, int target) {
//         ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
//         if (num == null || num.length == 0)
//             return res;
        
//         int n = num.length;
    
//         Arrays.sort(num); 
    
//         for (int i = 0; i < n; i++) {
        
//             int target_3 = target - num[i];
        
//             for (int j = i + 1; j < n; j++) {
            
//                 int target_2 = target_3 - num[j];
            
//                 int front = j + 1;
//                 int back = n - 1;
            
//                 while(front < back) {
                
//                     int two_sum = num[front] + num[back];
                
//                     if (two_sum < target_2) front++;
                
//                     else if (two_sum > target_2) back--;
                
//                     else {
                    
//                         List<Integer> quad = new ArrayList<>(); 
//                         quad.add(num[i]);
//                         quad.add(num[j]);
//                         quad.add(num[front]);
//                         quad.add(num[back]);
//                         res.add(quad);
                    
//                         // Processing the duplicates of number 3
//                         while (front < back && num[front] == quad.get(2)) ++front;
                    
//                         // Processing the duplicates of number 4
//                         while (front < back && num[back] == quad.get(3)) --back;
                
//                     }
//                 }
                
//                 // Processing the duplicates of number 2
//                 while(j + 1 < n && num[j + 1] == num[j]) ++j;
//             }
        
//             // Processing the duplicates of number 1
//             while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
//         }
        
    
//         return res;
//     }
// }