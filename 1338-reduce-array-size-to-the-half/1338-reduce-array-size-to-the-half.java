class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list, (a,b)->b-a);
        int n = arr.length;
        int sum = 0, cnt = 0;
        for(int i : list){
            sum+=i;
            cnt++;
            if(sum>=n/2) return cnt;
        }
        return cnt;
    }
}