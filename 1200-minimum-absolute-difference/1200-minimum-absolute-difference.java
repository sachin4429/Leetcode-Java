class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++)
        {
            List<Integer> innerres = new ArrayList<Integer>();
            if(Math.abs(arr[i] - arr[i-1]) == min)
            {
                innerres.add(arr[i-1]);
                innerres.add(arr[i]);
                res.add(innerres);
            }
            else if(Math.abs(arr[i] - arr[i-1]) < min)
            {
                min = Math.abs(arr[i] - arr[i-1]);
                res.clear();
                innerres.add(arr[i-1]);
                innerres.add(arr[i]);
                res.add(innerres);
            }
        }
        return res;
    }
}