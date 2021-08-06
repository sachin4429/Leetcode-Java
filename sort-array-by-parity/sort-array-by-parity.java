class Solution {
    public int[] sortArrayByParity(int[] image) {
        for(int i = 0; i<image.length; i++)
        {
            for(int j = 0, l = image.length-1; l>j; j++, l--)
            {
                
            }
        }
        int f = 0, l = image.length-1;
        while(f<l)
        {
            if(image[f]%2 != 0 && image[l]%2 == 0)
                {
                    image[f] = image[f] + image[l];
                    image[l] = image[f] - image[l];
                    image[f] = image[f] - image[l];
                    f++;
                    l--;
                }
            else if(image[f]%2==0)
                f++;
            else if(image[l]%2!=0)
                l--;
        }
        return image;
    }
}