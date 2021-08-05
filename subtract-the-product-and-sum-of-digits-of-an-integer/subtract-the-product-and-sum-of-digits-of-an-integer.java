class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n, sum = 0, prod = 1;
        while(temp != 0)
        {
            int rem = temp%10;
            sum += rem;
            prod *= rem;
            temp = temp/10;
        }
        //System.out.println(sum + " " + prod);
        return prod-sum;
    }
}