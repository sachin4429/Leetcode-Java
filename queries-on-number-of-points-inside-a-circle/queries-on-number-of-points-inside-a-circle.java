class Solution {
    double equation(int arr[], int brr[])
    {
        return Math.pow((brr[0]-arr[0]),2) + Math.pow((brr[1]-arr[1]),2) - Math.pow(arr[2],2);
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int res[] = new int[queries.length];
        for(int i = 0; i<queries.length; i++)
        {
            int count = 0;
            for(int j = 0; j<points.length; j++)
            {
                if(equation(queries[i],points[j]) <= 0)
                    count++;
            }
            res[i] = count;
        }
        return res;
    }
}