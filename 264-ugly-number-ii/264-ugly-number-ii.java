class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        int p1 = 0, p2 =0, p3 =0;
        for(int i =1; i<n; i++)
        {
            int two = t.get(p1)*2;
            int three = t.get(p2)*3;
            int five = t.get(p3)*5;
            t.add(Math.min(two, Math.min(three, five)));
            if(t.get(i) == two) p1++;
            if(t.get(i) == three) p2++;
            if(t.get(i) == five) p3++;
        }
        return t.get(t.size()-1);
    }
}