class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        HashSet<String> set = new HashSet<>();
        for (int d[] : dig) set.add(d[0] + " " + d[1]);
        int c = 0;
        for (int a[] : artifacts) 
        {
            boolean done = true;
            for (int i = a[0]; i <= a[2]; i++) //Traverse Row wise
            {
                for (int j = a[1]; j <= a[3]; j++) // Traverse colum wise
                {
                    if (!set.contains(i + " " + j)) done = false;
                }
            }
            if (done) c++;
        }
        return c;
    }
}