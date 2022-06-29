class Solution {
    public int largestInteger(int num) {
        int n = num;
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        while(n>0)
        {
            int remain = n%10;
            arr.add(remain);
            if(remain%2==0){
                even.offer(remain);
            }
            else if(remain%2!=0){
                odd.offer(remain);
            }
            n = (n-remain)/10;
        }
        for(int i=0; i<arr.size(); i++)
        {
            if(arr.get(i)%2==0)
            {
                arr.set(i,even.poll());
            }
            else
            {
                arr.set(i,odd.poll());
            }
        }
        long temp=1, ans=0;
        for(int i=0; i<arr.size(); i++)
        {
            ans+=temp*arr.get(i);
            temp=temp*10;
        }
        return (int)ans;
    }
}