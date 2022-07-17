class Solution {
class Node 
{
    int ind;
    String s;
    Node(String s, int i) 
    {
        this.s = s;
        this.ind = i;
    }
}
public int[] smallestTrimmedNumbers(String[] nums, int[][] q) 
{
    int res[] = new int[q.length];
    int itr = 0;
    int n = nums[0].length();
    for(int i = 0 ;i<q.length;i++) {
        ArrayList<Node> arr = new ArrayList<>();
        int temp = q[i][1];
        for(int j =0;j<nums.length;j++) 
        {
            arr.add(new Node(nums[j].substring(n - temp), j));
        }
    
        Collections.sort(arr,(a,b) -> (a.s).compareTo(b.s));
        res[itr++] = arr.get(q[i][0]-1).ind; 
    }
    return res;
}
}
      