class Solution {
    public int[] diStringMatch(String S) {
        int max = S.length();
        int len = S.length();
        int min = 0;
        int[] ans = new int[max+1];
        for(int i = 0;i < len;i++){
            if(S.charAt(i) == 'D'){
                ans[i] = max--;
            }else{
                ans[i] = min++;
            }
        }
        ans[len] = max;
        return ans;
                
    }
}