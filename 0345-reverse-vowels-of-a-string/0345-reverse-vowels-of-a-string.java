class Solution 
{
    public String reverseVowels(String s) 
    {
        int i = 0;
        int j = s.length() - 1;

        char ar[] = s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(i < j)
        {
            if(set.contains(ar[i]) && set.contains(ar[j]))
            {
                char c = ar[i];
                ar[i] = ar[j];
                ar[j] = c;
                i++;
                j--;
            }
            
            else if((!set.contains(ar[i])) && set.contains(ar[j]))
            {
                i++;
            }

            else if((!set.contains(ar[j])) && set.contains(ar[i]))
            {
                j--;
            }

            else
            {
                i++;
                j--;
            }
        }

        return String.valueOf(ar);
    }
}