class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int arr[] = new int[n+1];
        arr[0] = first;
        for(int i = 1; i<n+1; i++)
        {
            arr[i] = encoded[i-1]^arr[i-1];
        }
        return arr;
    }
}