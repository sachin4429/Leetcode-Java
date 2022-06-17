class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        int m = nums1.length, n = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = n-1; i>=0; i--)
        {
            while(stack.size() > 0 && stack.peek() < nums2[i])
                stack.pop();
            map.put(nums2[i], stack.size() == 0 ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        
        for(int i = 0 ; i<m; i++)
            nums1[i] = map.get(nums1[i]);
        
        return nums1;
    }
}