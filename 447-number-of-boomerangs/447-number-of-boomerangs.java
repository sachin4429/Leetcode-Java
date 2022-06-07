class Solution {
    public long getDist(int i,int j,int arr[][]){
        long a1=(long)arr[i][0];
        long a2=(long)arr[j][0];
        long b1=(long)arr[i][1];
        long b2=(long)arr[j][1];
        return (a1-a2)*(a1-a2)+(b1-b2)*(b1-b2);
    }
    
   
    public int numberOfBoomerangs(int[][] arr) {
        int result=0;
        for(int i=0; i<arr.length; i++){
           
            // this will store the distance from ith point  key->dist, value->number of points at key dist from ith point 
            Map<Long, Integer>map = new HashMap<>();
            
            for(int  j = 0; j < arr.length; j++){
                long dist = getDist(i, j, arr);
                
                map.put(dist, map.getOrDefault(dist, 0)+1);
                
            }
            
            for(int n : map.values()){
                // n*(n-1) -> number of ways to choose two items from list having items n
                result += n*(n-1); 
            }
            
        }
        return result;
    }
}