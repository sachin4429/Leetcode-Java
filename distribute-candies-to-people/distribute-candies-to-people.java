class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int distribute = 1;
        int index = 0;
        while (candies > 0) {
            if (candies <= distribute) {
                res[index] += candies;
                break;
            } else {
                res[index] += distribute;
                candies -= distribute++;
                index = index == num_people - 1 ? 0 : index + 1;
            }
        }
        return res;
    }
}