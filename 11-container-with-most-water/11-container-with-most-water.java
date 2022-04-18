class Solution {
    public int maxArea(int[] height) {
       int i = 0, j = height.length-1, res = 0;
        while(i<j)
        {
            int w = j-i;
            int mh = Math.min(height[i], height[j]);
            int temp = mh*w;
            res = Math.max(res, temp);
            if(mh == height[i])
                i++;
            else
                j--;
        }
        return res; 
    }
}