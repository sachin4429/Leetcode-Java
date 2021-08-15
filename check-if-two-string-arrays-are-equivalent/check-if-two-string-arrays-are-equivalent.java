class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "", str2 = "";
        for(String res : word1)
        {
            str1+=res;
        }
        for(String res : word2)
        {
            str2+=res;
        }
        return str1.equals(str2);
    }
}