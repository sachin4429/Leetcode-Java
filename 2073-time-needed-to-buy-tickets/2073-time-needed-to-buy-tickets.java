class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
          for(int i=0; i<tickets.length; i++)
          {
              if(tickets[i]<tickets[k]) time+=tickets[i];
              else if(i<=k)time+=tickets[k];
              else if(i>k) time+=tickets[k]-1;   
          }
          return(time);
    }
}

// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         int i = 0;
//         int ans = 0;
//         int n = tickets.length;
//         while(tickets[k] > 0){
//             if(tickets[i%n] > 0){
//                 tickets[i%n]--;
//                 i++;
//                 ans++;
//             }
//             else{
//                 i++;
//             }
//         }
//         return ans;
//     }
// }