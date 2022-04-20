class Solution {
    public int trap(int[] height) {
        if(height.length == 1)
            return 0;
        int l[] = new int[height.length];
        int r[] = new int[height.length];
        l[0] = height[0];
        r[height.length-1]= height[height.length-1];
        for(int i = 1; i<height.length; i++)
        {
            l[i] = Math.max(l[i-1],height[i]);
        }
        for(int i = height.length-2; i>=0; i--)
        {
            r[i] = Math.max(r[i+1],height[i]);
        }
        int res = 0;
        for(int i = 0; i<height.length; i++)
        {
            //System.out.println(l[i]+" "+r[i]);
            res += Math.min(r[i],l[i])-height[i];
        }
        return res;
    }
}