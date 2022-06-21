class Solution {
    public int minTaps(int n, int[] ranges) {
        int min = 0;
        int max = 0;
        int total = 0;
        
        while(max<n) {
            
            for(int i = 0; i<ranges.length; i++) {
                int left = i - ranges[i];
                int right = i + ranges[i];
                
                if(left<=min && right >max) {
                    max = right;
                }
            }
            
            if(min == max) {
                return -1;
            }
            
            min = max;
            total++;
        }
        
        
        return total;
    }
}