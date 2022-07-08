class Solution {
    public int countPoints(String rings) {
        HashMap<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
        int n = rings.length();
        for(int i = 0; i<=n-2; i+=2)
        {
            if(!map.containsKey((int)rings.charAt(i+1)-'0'))
                map.put((int)rings.charAt(i+1)-'0', new StringBuilder());
            map.get((int)rings.charAt(i+1)-'0').append(rings.charAt(i));
        }
        //System.out.println(map);
        int res = 0;
         for(Map.Entry<Integer, StringBuilder> entry : map.entrySet())
         {
             if(entry.getValue().length()>=3)
             {
                 String temp = entry.getValue().toString();
                 if(temp.contains("R") && temp.contains("B") && temp.contains("G"))
                 res++;
             }
         }
            
        return res;
    }
}