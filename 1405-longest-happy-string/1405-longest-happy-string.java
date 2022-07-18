class Solution {
    public String longestDiverseString(int a, int b, int c) {
        class Pair{
            int fre;
            char ch;
            Pair(int fre, char ch)
            {
                this.fre = fre;
                this.ch = ch;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->y.fre-x.fre);
        if(a != 0)
            pq.add(new Pair(a,'a'));
        if(b != 0)
            pq.add(new Pair(b,'b'));
        if(c != 0)
            pq.add(new Pair(c,'c'));
        String ans = "";
        while(pq.size()>1)
        {
            Pair one = pq.poll();
            Pair two = pq.poll();
            if(one.fre>=2)
            {
                ans += one.ch;
                ans += one.ch;
                one.fre -= 2;
            }
            else
            {
                ans += one.ch;
                one.fre -= 1;
            }
            if(two.fre>=2 && two.fre>=one.fre){
                ans+=two.ch;
                ans+=two.ch;
                two.fre-=2;
            }
            else{
                ans+=two.ch;
                two.fre-=1;
            }
            if(one.fre>0)
                pq.add(one);
            if(two.fre>0)
                pq.add(two);
    
        }
        if(pq.isEmpty())
            return ans;
        if(pq.peek().fre>=2)
        {
            ans+=pq.peek().ch;
            ans+=pq.peek().ch;
        }
        else
        {
            ans+=pq.peek().ch;
        }
        return ans;
        
    }
}