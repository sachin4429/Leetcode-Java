class Solution {
    public String reorganizeString(String s) {
        class Pair{
            int fre;
            char ch;
            Pair(int fre, char ch)
            {
                this.fre = fre;
                this.ch = ch;
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->y.fre-x.fre);
        map.forEach((k,v) -> pq.add(new Pair(v,k)));
        String ans = "";
        while(pq.size()>1)
        {
            Pair one = pq.poll();
            Pair two = pq.poll();
            if(one.fre>=1)
            {
                ans += one.ch;
                one.fre -= 1;
            }
            if(two.fre>=1)
            {
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
        if(pq.peek().fre>=1)
        {
            ans+=pq.peek().ch;
        }
        if(s.length() == ans.length())
            return ans;
        else
            return "";
    }
}