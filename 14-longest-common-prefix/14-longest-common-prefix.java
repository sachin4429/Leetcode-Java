class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(longestCommonPrefix)!=0){
                longestCommonPrefix=longestCommonPrefix.substring(0,longestCommonPrefix.length()-1);
            }
        }
        return longestCommonPrefix;
    }
}