class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> hmts;
    HashMap<Integer, Integer> hm;
    public NumberContainers() {
        hmts = new HashMap<>();
        hm = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(hm.containsKey(index))
        {
            hmts.get(hm.get(index)).remove(index);
        }
        hm.put(index, number);
         if (!hmts.containsKey(number))
            hmts.put(number, new TreeSet<>());
        hmts.get(number).add(index);
    }
    
    public int find(int number) 
    {
        if(!hmts.containsKey(number) || hmts.get(number).size() == 0)
            return -1;
        return hmts.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */