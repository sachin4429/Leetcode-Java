class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<list1.length; i++)
            map.put(list1[i], i);
        ArrayList<String> res = new ArrayList<String>();
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i<list2.length; i++)
        {
            if(map.containsKey(list2[i]))
            {
                int temp = i + map.get(list2[i]);
                if(temp<sum)
                {
                    res.clear();
                    res.add(list2[i]);
                    sum = temp;
                }
                else if(temp == sum)
                {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}