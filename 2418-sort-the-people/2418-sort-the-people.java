class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>((a,b)->b-a);
        for(int i = 0; i<heights.length; i++)
        {
            map.put(heights[i], names[i]);
        }
        int i = 0;
        for(String u : map.values())
        {
            names[i] = u;
           i++; 
        }
        return names;
    }
}