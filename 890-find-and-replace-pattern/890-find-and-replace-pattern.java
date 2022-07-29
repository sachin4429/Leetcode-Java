class Solution {
    public List<String> findAndReplacePattern(String[] words, String p) {
        List<String> res = new ArrayList<String>();
        for(String s : words)
        {
            Set<Character> s1 = new HashSet<Character>();
            Set<Character> p1 = new HashSet<Character>();
            HashMap<Character, Character> map = new HashMap<>();
            for(char ch : p.toCharArray())
            {
                p1.add(ch);
            }
            for(char ch : s.toCharArray())
            {
                s1.add(ch);  
            }
            if(p1.size() == s1.size())
            {
                boolean flag = false;
                for(int i = 0; i<p.length(); i++)
                {
                    if(map.containsKey(p.charAt(i)))
                    {
                        if(map.get(p.charAt(i)) != s.charAt(i))
                        {
                            flag = true;
                            break;
                        }
                    }
                    else
                        map.put(p.charAt(i), s.charAt(i));
                }
                if(flag == false)
                   res.add(s); 
            }
        }
        return res;
    }
}