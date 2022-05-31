class Solution {
    public boolean hasAllCodes(String s, int k) {
         Set<Integer> set= new HashSet<>();
        for(int i=0;i<=s.length()-k;i++)
        { 
                set.add(Integer.parseInt(s.substring(i,i+k),2));// Converting into decimal and then adding it to set.
        }
        for(int i=0;i<Math.pow(2,k);i++)// checking if all elements are present or not
        {
            if(!set.contains(i))
                return false;
        }
        return true;
        
    }
}