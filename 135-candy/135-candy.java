class Solution {
    public int candy(int[] ratings) {
     int n=ratings.length;
     int[] left=new int[n];
     int[] right=new int[n];
     left[0]=1;
     for(int i=1;i<n;i++){
         
         //if current index is more than the previous candy give 1 more to the current else keep it as 1
         if(ratings[i]>ratings[i-1])
             left[i]=left[i-1]+1;
         else
             left[i]=1;
     }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                right[i]=right[i+1]+1;
            else
                right[i]=1;
                
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            max+=Math.max(left[i],right[i]);
        }
                
        return max;
                 
    }
}