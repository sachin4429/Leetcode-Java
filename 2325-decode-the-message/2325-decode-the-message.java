class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char ind = 'a';
        for(char ch : key.toCharArray())
        {
            if(ch == ' ')
                continue;
            if(!map.containsKey(ch))
            {
                map.put(ch,ind);
                ind++;
            }
        }
        //System.out.println(map);
        String op = "";
        for(char ch : message.toCharArray())
        {
            if(ch == ' ')
                op += ch;
            else
                op += map.get(ch);
        }
        return op;
    }
}