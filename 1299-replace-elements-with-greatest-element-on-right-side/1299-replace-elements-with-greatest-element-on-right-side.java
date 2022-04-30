class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, max = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i>=0; i--)
        {
            int temp = arr[i];
            arr[i] = Math.max(max, arr[i+1]);
            max = Math.max(max, temp);
        }
        return arr;
    }
}