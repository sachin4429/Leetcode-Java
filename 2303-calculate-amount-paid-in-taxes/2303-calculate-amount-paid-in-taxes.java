class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0.0;
        if(income == 0)
            return ans;
        int prev = 0;
        for(int[] i : brackets)
        {
            if(income > i[0]-prev)
            {
                income -= i[0]-prev;
                ans += ((i[0]-prev)*i[1])/100.00;
            }
            else if(income == 0)
                return ans;
            else if(income <= i[0]-prev)
            {
                ans += (income*i[1])/100.00;
                income = 0;
            }
            prev = i[0];
        }
        return ans;
    }
}