class Solution {
    public int minimumTime(String s) {
        int size = s.length();
        int [] cost = new int[size+1];
        
        // calculate the cost from left to right;
        for(int i=0;i<size;i++){ 
            if(s.charAt(i) == '1'){
                cost[i+1] = Math.min(i+1, cost[i] + 2); //cost is min of length and spot removal cost
            }else{
                cost[i+1] = cost[i];
            }
        }
        
        int out = cost[size];
        // calculate the cost from right to left;
        int [] cost2 = new int[size+1];
        for(int i=size-1;i>=0;i--){
            if(s.charAt(i) == '1'){
                cost2[i] = Math.min(size-i , cost2[i+1] + 2 ); //cost is min of length and spot removal cost
            }else{
                cost2[i] = cost2[i+1];
            }
            // find the sum which is min so that it will be the optimal cost from both edges.
            out = Math.min(out, cost[i] + cost2[i]);
        }

       
        return out;
    }
}