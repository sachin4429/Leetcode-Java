class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> srr = new HashSet<Integer>();
        for(int i : arr)
        {
            if(srr.contains(i*2) || (i%2==0 && srr.contains(i/2)))
                return true;
            srr.add(i);
        }
        return false;
    }
}