class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ArrayList<Integer> rs = new ArrayList<Integer>();
        ArrayList<Integer> lt = new ArrayList<Integer>();
        ArrayList<Integer> rt = new ArrayList<Integer>();
        StringBuilder s = new StringBuilder("");
        StringBuilder t = new StringBuilder("");
        for(int i = 0; i < n; i++){
            if (start.charAt(i) == 'L')
                ls.add(i);
            if (start.charAt(i) == 'R')
                rs.add(i);
            if (target.charAt(i) == 'L')
                lt.add(i);
            if (target.charAt(i) == 'R')
                rt.add(i);
        }
        if (ls.size() != lt.size() || rs.size() != rt.size())
            return false;
        for(int i = 0; i < n; i++){
            if(start.charAt(i) != '_')
                s.append(start.charAt(i));
        }
        for(int i = 0; i < n; i++){
             if(target.charAt(i) != '_')
                t.append(target.charAt(i));
        }
        if(!s.toString().equals(t.toString())) return false;
        for(int i = 0; i < ls.size(); i++)
            if (ls.get(i) < lt.get(i))
                return false;
        for(int i = 0; i < rs.size(); i++)
            if (rs.get(i) > rt.get(i))
                return false;
        return true;
    }
    
}