class Solution {
    public int largestInteger(int num) {
        if(num<10)
            return num;
        String s = Integer.toString(num);
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b) -> b-a);
        for(char ch : s.toCharArray())
        {
            int i = ch-'0';
            if(i%2 == 0)
                even.add(i);
            else
                odd.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            int i = ch-'0';
            if(i%2 == 0)
                sb.append(Integer.toString(even.poll()));
            else
                sb.append(Integer.toString(odd.poll()));
        }
        return Integer.parseInt(sb.toString());
    }
}