class Solution {
    public int[] deckRevealedIncreasing(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)q.add(i);
        int[]ans=new int[n];
        int k=0;
        while(q.size()>0){
            int temp=q.remove();
            ans[temp]=arr[k++];
            if(q.size()>0)q.add(q.remove());
        }
        return ans;
    }
}