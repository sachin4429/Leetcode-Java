// class Solution {
//     public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
//         Arrays.sort(tiles, (a,b) -> a[0]-b[0]);
//         int prev[] = new int[2];
//         int max = Integer.MIN_VALUE;
//         int temp = 0;
//         for(int i[] : tiles)
//         {
//             temp = i[1]-i[0]+1;
//             if(prev[0] != 0)
//             {
//                 if(prev[1]+1 == i[0])
//                     temp += prev[1]-prev[0]+1; 
//             }
//             max = Math.max(max,temp);
//             prev = i;
//         }
//          if(max >= carpetLen)
//              return carpetLen;
//         return max;
//     }
// }
class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (a,b) -> a[0] - b[0]);
        int ans = 0, ci = 0, cj = 0, covered = 0;
        for(int idx = 0; idx < tiles.length; ){
            cj = tiles[ci][0] + carpetLen; // right end of carpet
            if(ci == idx || cj > tiles[idx][1]){ //carpet left end = start of the white tile OR carpet stretch > current white tile length
                covered += (tiles[idx][1] - tiles[idx][0] + 1);
                ans = Math.max(covered, ans); 
                idx++; // keep engulfing white tiles
            }
            else{
                int partial = cj - tiles[idx][0]; // t0, c, c, cj, ...t1  
                ans = Math.max(covered + partial, ans);
                covered -= (tiles[ci][1] - tiles[ci][0] + 1); 
                ci++; // shift left end of carpet
            }
        }
        return Math.min(ans, carpetLen);
    }
}