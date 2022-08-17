class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String str[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(String i : words)
        {
            StringBuilder sb = new StringBuilder();
            for(char ch : i.toCharArray())
            {
                sb.append(str[ch-'a']);
            }
            set.add(sb.toString());
        }   
        //System.out.println(set);
        return set.size();
    }
}