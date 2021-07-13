class Solution {
    public int romanToInt(String s) {
        //Start
        Map<Character,Integer> m= new HashMap();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        //System.out.println(s.length()-1);
        int res=m.get(s.charAt(s.length()-1));
        for(int i=(s.length()-2) ; i>=0 ; i--)
        {
            if(m.get(s.charAt(i)) < m.get(s.charAt(i+1)))
                res-=m.get(s.charAt(i));
            else
                res+=m.get(s.charAt(i));
        }
        
        return res;
        
        //end
    }
}