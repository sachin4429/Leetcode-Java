
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2Utility(0, candidates, target, ans, ds);
        return ans;
    }
    
    public void combinationSum2Utility(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
       
            if(target == 0 ){
                ans.add(new ArrayList<>(ds));
                return;
            }
            
        
        
        // All possibilities of pick condition 
        for(int i = ind ; i< arr.length; i++) {
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i]  > target ) break;
            
            ds.add(arr[i]);
            combinationSum2Utility(i+1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
       
        
    }
}

// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates);
//         List<List<Integer>> ans = new ArrayList<List<Integer>>();
//         List<Integer> curr = new ArrayList<Integer>();
//         combi(0,candidates,target,ans,curr);
//         return ans;
//     }
//     public void combi(int index, int[] can, int target, List<List<Integer>> ans, List<Integer> curr)
//     {
//         if(index == can.length)
//         {
//             if(target == 0)
//             {
//                 if(!ans.contains(curr))
//                     ans.add(new ArrayList<>(curr));  
//             }
//             return;
//         }
//         if(can[index] <= target)
//         {
//             curr.add(can[index]);
//             combi(index+1, can, target-can[index], ans, curr);
//             curr.remove(curr.size()-1);
//         }
//         combi(index+1, can, target, ans, curr);
//     }
// }