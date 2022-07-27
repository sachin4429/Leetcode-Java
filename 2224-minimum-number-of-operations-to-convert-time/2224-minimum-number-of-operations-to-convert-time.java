class Solution {
    public int convertTime(String current, String correct) {
        String[] str = current.split(":");
        String[] ptr = correct.split(":");
        int cm = Integer.parseInt(str[1]) + Integer.parseInt(str[0])*60;
        int am = Integer.parseInt(ptr[1]) + Integer.parseInt(ptr[0])*60;
        int ans = 0;
        int gap = Math.abs(am-cm);
        int arr[] = {60,15,5,1};
        while(gap != 0)
        {
            for(int i : arr)
            {
                if(gap >= i)
                {
                    ans++;
                    gap -= i;
                    break;
                }
            }
        }
        return ans;
    }
}