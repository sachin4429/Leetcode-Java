class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0;
        int ans = 0;
        int n = tickets.length;
        while(tickets[k] > 0){
            if(tickets[i%n] > 0){
                tickets[i%n]--;
                i++;
                ans++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}