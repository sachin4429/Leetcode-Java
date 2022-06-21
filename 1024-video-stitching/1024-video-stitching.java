class Solution {
    public int videoStitching(int[][] clips, int time) {
        int min = 0;
        int max = 0;
        int total = 0;
        
        while(max<time) {
            
            for(int[] clip : clips) {
                int left = clip[0];
                int right = clip[1];
                
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