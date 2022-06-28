class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(sr < 0 || sc < 0)
            return image;
        if(sr > image.length || sc >image[0].length)
            return image;
        int prev = image[sr][sc];
        if(prev == color)
            return image;
        image[sr][sc] = color;
        if(sr-1 >= 0 && image[sr-1][sc] == prev)
            floodFill(image, sr-1, sc, color);
        if(sc-1 >= 0 && image[sr][sc-1] == prev)
            floodFill(image, sr, sc-1, color);
        if(sr+1 < image.length && image[sr+1][sc] == prev)
            floodFill(image, sr+1, sc, color);
        if(sc+1 < image[0].length && image[sr][sc+1] == prev)
            floodFill(image, sr, sc+1, color);
        return image;
    }
}