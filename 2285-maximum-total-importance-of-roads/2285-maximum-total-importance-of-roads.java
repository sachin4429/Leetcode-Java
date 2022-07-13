// class Solution {
//     public long maximumImportance(int n, int[][] roads) {
//         ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
//         for(int i = 0; i < n; i++)
//             adj.add(new ArrayList<Integer>());
//         for(int itr[] : roads)
//         {
//             adj.get(itr[0]).add(itr[1]);
//             adj.get(itr[1]).add(itr[0]);
//         }
//         int indegree[] = new int[n];                
//                 //finding indegree
//         for(int i = 0;i<n;i++) 
//         {
//             for(Integer it: adj.get(i)) 
//             {
//                 indegree[it]++;
//             }
//         }
        
//     }
// }
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans = 0, x = 1;
		long degree[] = new long[n];
        for(int road[] : roads){
            degree[road[0]]++; 
			degree[road[1]]++;
        }
        Arrays.sort(degree);
        for(long i : degree) 
        {
            ans +=  i * (x++);
            System.out.println(i+" "+x);
        }
        return ans;
    }
}