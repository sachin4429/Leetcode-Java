class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++)
        {
            for(int j = 0, l = image.length-1; l>=j; j++, l--)
            {
                if(image[i][j] == image[i][l])
                {
                    if(image[i][j] == 0)
                    {
                        image[i][j] = 1;
                        image[i][l] = 1;
                    }
                    else
                    {
                        image[i][j] = 0;
                        image[i][l] = 0;
                    }
                }
            }
        }
        return image;
    }
}