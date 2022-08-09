class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, (a,b) -> a[0]-b[0]);
        Arrays.sort(items2, (a,b) -> a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i<items1.length && j<items2.length)
        {
            //System.out.println(items1[i][0] +" "+ items2[j][0]+ "  "+ i+" "+j);
            if(items1[i][0] == items2[j][0])
            {
                //System.out.println(1);
                List<Integer> inner = new ArrayList<Integer>();
                inner.add(items1[i][0]);
                inner.add(items1[i][1]+items2[j][1]);
                res.add(inner);
                i++; j++;
            }
            else if(items1[i][0] < items2[j][0])
            {
                //System.out.println(2);
                List<Integer> inner = new ArrayList<Integer>();
                inner.add(items1[i][0]);
                inner.add(items1[i][1]);
                res.add(inner);
                i++;
            }
            else
            {
                //System.out.println(3);
                List<Integer> inner = new ArrayList<Integer>();
                inner.add(items2[j][0]);
                inner.add(items2[j][1]);
                res.add(inner);
                j++;
            }
        }
            while(i<items1.length)
            {
                List<Integer> inner = new ArrayList<Integer>();
                inner.add(items1[i][0]);
                inner.add(items1[i][1]);
                res.add(inner);
                i++;
            }
            while(j<items2.length)
            {
                List<Integer> inner = new ArrayList<Integer>();
                inner.add(items2[j][0]);
                inner.add(items2[j][1]);
                res.add(inner);
                j++;
            }
        return res;
    }
}