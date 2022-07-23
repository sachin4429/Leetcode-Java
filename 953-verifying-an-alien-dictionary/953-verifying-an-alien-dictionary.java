class Solution {
    HashMap<Character, Integer> map;
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1)
            return true;
        map = new HashMap<>();
        for(int i = 0; i<order.length(); i++)
        {
            map.put(order.charAt(i),i);
        }
        for(int i = 0; i<words.length-1; i++)
        {
            if(isMatching(words[i].toCharArray(),words[i+1].toCharArray()) == false)
                return false;
        }
        return true;
    }
    public boolean isMatching(char[] a, char[] b)
    {
        int i = 0, j = 0;
        while(i<a.length && j<b.length)
        {
            if(map.get(a[i])>map.get(b[j]))
                return false;
            else if(map.get(a[i]) == map.get(b[j]))
            {
                i++; j++;
            }
            else
                return true;
        }
        if(j == b.length && i != a.length)
                return false;
            else
                return true;
    }
}