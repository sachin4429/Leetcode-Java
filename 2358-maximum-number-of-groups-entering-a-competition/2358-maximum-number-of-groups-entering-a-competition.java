class Solution {
    public int maximumGroups(int[] grades) {
        int i = 0, j = 0, count = 0;
        int n = grades.length;
        while(i+j+1<=n)
        {
            j++;
            i+=j;
            count++;
            //System.out.println(count+" "+i+" "+j);
        }
        return count;
    }
}

