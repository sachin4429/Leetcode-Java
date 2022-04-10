class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for(int boxType[] : boxTypes) {
            int numOfBoxes = boxType[0];
            int numOfUnits = boxType[1];
            if(numOfBoxes > truckSize) {
                ans += truckSize*numOfUnits;
                break;
            }
            ans += numOfBoxes*numOfUnits;
            truckSize -= numOfBoxes;
        }
        return ans;
    }
}