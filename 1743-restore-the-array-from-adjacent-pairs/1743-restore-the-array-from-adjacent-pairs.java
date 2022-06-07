class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        
        for(int[] arr : adjacentPairs){
            
            ArrayList<Integer> cur = adj.getOrDefault(arr[0], new ArrayList<Integer>());
            cur.add(arr[1]);
            
            adj.put(arr[0], cur); 
            
         ArrayList<Integer> cur2 = adj.getOrDefault(arr[1], new ArrayList<Integer>());
            cur2.add(arr[0]);
            
            adj.put(arr[1], cur2);

        }
        ArrayList<Integer> ord = new ArrayList<>();
        int[] answer = new int[adj.keySet().size()];
        
        for(Integer n : adj.keySet()){
            if(adj.get(n).size()==1){
                ord.add(n);
                break; 
            }  
            
        }
        HashSet<Integer> seen = new HashSet<>();
        int count = 0; 
        
        while(ord.size() != 0){
            
            ArrayList<Integer> loop = adj.get(ord.get(0));
            if(!seen.contains(ord.get(0)))
            {
             answer[count] = ord.get(0);
            seen.add(ord.get(0));
                count++;
            }
            
            for(Integer n : loop){
                if(!seen.contains(n)){
                   ord.add(n);
                   
                    break; 
                }
            }
            ord.remove(0);
            
            
        }
        
        return answer; 
        
        
    }
}