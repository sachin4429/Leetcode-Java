class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int top = 0, down = a.length-1, left = 0, right = a[0].length-1;
        List<Integer> ll = new ArrayList<Integer>();
        int dir = 0;
        while(top<=down && left<=right)
        {
            if(dir == 0)
            {
                for(int i = left; i<=right; i++)
                    ll.add(a[top][i]);
                    top++;
            }
            else if(dir == 1)
            {
                for(int i = top; i<=down; i++)
                    ll.add(a[i][right]);
                    right--;
            }
            else if(dir == 2)
            {
                for(int i = right; i>=left; i--)
                    ll.add(a[down][i]);
                    down--;
            }
            else if(dir == 3)
            {
                for(int i = down; i>=top; i--)
                    ll.add(a[i][left]);
                    left++;
            }
            dir = (dir+1)%4;
        }
        return ll;
    }
}