class Solution {
    public boolean isCircularSentence(String sentence) {
        String parts[] = sentence.split(" ");
        if(parts.length == 0)
            return true;
        if(parts.length == 1)
        {
            if(parts[0].charAt(0) == parts[0].charAt(parts[0].length()-1))
                return true;
            else
                return false;
        }
        String ptr = parts[parts.length-1];
        char last = ptr.charAt(ptr.length()-1);
        for(String str : parts)
        {
            if(last != str.charAt(0))
                return false;
            last = str.charAt(str.length()-1);
        }
        return true;
    }
}