class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int i:target){ sum+=i;pq.add(i);}
        while(pq.peek()!=1){
            int top=pq.poll();
            sum-=top;
            if(sum<=0 || sum>=top) return false;
            top=top%sum;
            sum+=top;            
            pq.add(top>0?top:sum);
        }
        return true;
    }
}