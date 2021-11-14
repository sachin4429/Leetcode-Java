class CombinationIterator {
    StringBuilder sb;
    String s;
    int len;
    HashMap<Character, Integer> hm;

    public CombinationIterator(String characters, int combinationLength) {
        this.sb = new StringBuilder();
        this.s = characters;
        this.len = combinationLength;
        this.hm = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(sb.length() < len){
                sb.append(c);
            }

            hm.put(c, i);
        }
    }

    public String next() {
        String res = sb.toString();
        int ind = s.length() - 1;
        while(ind >= 0 && sb.length() != 0 && sb.charAt(sb.length() -1) == s.charAt(ind)){
            sb.deleteCharAt(sb.length() - 1);
            ind--;
        }

        if(sb.length() == 0){
            return res;
        }

        char c = sb.charAt(sb.length() - 1);
        ind = hm.get(c) + 1;
        sb.deleteCharAt(sb.length() - 1);

        while(sb.length() < len && ind < s.length()){
            sb.append(s.charAt(ind));
            ind++;
        }

        return res;
    }

    public boolean hasNext() {
        return sb.length() != 0;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */