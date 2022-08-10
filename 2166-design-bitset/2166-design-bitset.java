class Bitset {
    HashSet<Integer> z = new HashSet<>();
    HashSet<Integer> o = new HashSet<>();
    int n;
    public Bitset(int size) {
        n = size;
        for(int i = 0; i<n; i++)
            z.add(i);
    }
    
    public void fix(int idx) {
        z.remove(idx);
        o.add(idx);
    }
    
    public void unfix(int idx) {
        o.remove(idx);
        z.add(idx);
    }
    
    public void flip() {
        HashSet<Integer> t = o;
        o = z;
        z = t;
    }
    
    public boolean all() {
        return n == o.size();
    }
    
    public boolean one() {
        return o.size()>0;
    }
    
    public int count() {
        return o.size();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++)
        {
            if(o.contains(i))
                sb.append('1');
            else
                sb.append('0');
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */