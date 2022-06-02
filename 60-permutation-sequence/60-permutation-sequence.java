class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 1; i<n; i++)
        {
            fact *= i;
            num.add(i);
        }
        num.add(n);
        String ans = ""; k--;
        while(true)
        {
            ans += num.get(k/fact);
            num.remove(k/fact);
            if(num.size() == 0)
                break;
            k %= fact;
            fact /= num.size();
        }
        return ans;
    }
}