class SmallestInfiniteSet {
    HashSet<Integer> setr;
    HashSet<Integer> seti;
    PriorityQueue<Integer> pq;
    int min = 0;
    public SmallestInfiniteSet() {
        setr = new HashSet<Integer>();
        seti = new HashSet<Integer>();
        pq = new PriorityQueue<Integer>();
        min = 1;
    }
    
    public int popSmallest() {
        while(setr.contains(min))
            min++;
        setr.add(min);
        return min;
    }
    
    public void addBack(int num) {
        if(setr.contains(num))
            setr.remove(num);
        if(num<min)
            min = num;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */