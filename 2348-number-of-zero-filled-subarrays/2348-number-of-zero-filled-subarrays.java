class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,l=0;
        for(int x:nums)
        {
            if(x==0) l++;
            else l=0;
            ans+=l;
        }
        return ans;
    }
}

// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         int j = 0;
//         long count = 0;
//         ArrayList<Long> arr = new ArrayList<Long>();
//         for(int i : nums)
//         {
//             if(i == 0)
//                 count++;
//             else
//             {
//                 if(count != 0)
//                     arr.add(count);
//                 count = 0;
//             }
//         }
//         arr.add(count);
//         long ans = 0;
//         for(Long i : arr)
//         {
//             if(i%2 == 0)
//             {
//                 ans += (i/2)*(i+1);
//             }
//             else
//             {
//                 ans += (i)*((i+1)/2);
//             }
//         }
//         return ans;
//     }
// }