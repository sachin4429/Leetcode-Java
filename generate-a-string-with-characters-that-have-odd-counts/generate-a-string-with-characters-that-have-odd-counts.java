class Solution {
    public String generateTheString(int n) {
        StringBuilder str = new StringBuilder();
        if(n%2 != 0)
        {
            for(int i = 0; i<n; i++)
            {
                str.append('s');
            }
        }
        else
        {
            str.append('p');
             for(int i = 1; i<n; i++)
            {
                str.append('s');
            }
        }
        return str.toString();
    }
}