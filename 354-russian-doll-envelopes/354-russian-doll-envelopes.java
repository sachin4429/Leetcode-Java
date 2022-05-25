class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        // Sorting the array on the basis of width
        
        Arrays.sort(envelopes,(a,b) -> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
        
        int[] dp=new int[envelopes.length];
        int maxlen=0;
        //Because there will be atleast one envelope
        for(int i=0;i<dp.length;i++){
            
           int index=bs(dp,0,maxlen,envelopes[i][1]);
           dp[index]=envelopes[i][1];
            
            if(index==maxlen) maxlen++;
        }
        
        return maxlen;
    }
    
    public int bs(int[] dp,int start,int end,int target){
        int index=Arrays.binarySearch(dp,start,end,target);
        if(index<0)
            index=-(index+1);
        
        return index;
    }
    
    
}