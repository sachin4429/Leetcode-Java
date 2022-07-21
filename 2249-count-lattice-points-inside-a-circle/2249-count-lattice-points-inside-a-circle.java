class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<String> hs = new HashSet<String>();
        for(int c[] : circles){
            int cx = c[0];
            int cy = c[1];
            int r = c[2];
            for(int i= cx-r; i <= cx+r; i++)
            for(int j= cy-r; j <= cy+r; j++)
                if((cx-i)*(cx-i) + (cy-j)*(cy-j) <= r*r)
                    hs.add(i+" "+j);
        }
        return hs.size();
    }
}