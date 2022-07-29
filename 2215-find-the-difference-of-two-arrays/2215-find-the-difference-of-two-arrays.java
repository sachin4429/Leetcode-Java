class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(); 
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i : nums1)
            set1.add(i);
        for(int i : nums2)
            set2.add(i);
        List<Integer> arr0 = new ArrayList<Integer>();
        List<Integer> arr1 = new ArrayList<Integer>();
        for(int i : set1)
        {
            if(!set2.contains(i))
                arr0.add(i);
        }
        for(int i : set2)
        {
            if(!set1.contains(i))
                arr1.add(i);
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(arr0);
        res.add(arr1);
        return res;
    }
}