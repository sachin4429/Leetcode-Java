class Solution {
    public int halveArray(int[] nums) {
        Double sum =0.0;
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a,b) -> Double.compare(b, a));
        for(double i : nums)
        {
            sum += i;
            pq.add(i);
        }
        int count = 0;
        Double half = sum/2;
        while(sum > half)
        {
            Double temp = pq.poll();
            temp /= 2;
            sum -= temp;
            count++;
            pq.add(temp);
        }
        return count;
    }
}