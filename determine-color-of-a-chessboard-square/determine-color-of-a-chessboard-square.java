class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) -96;
        int y = coordinates.charAt(1) - 48;
        if((x+y)%2==0)
            return false;
        else
            return true;
    }
}