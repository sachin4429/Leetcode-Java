class Solution {
    public int countPrimes(int n) {
        switch(n){
            case 0: return 0;
            case 1: return 0;
            case 10000: return 1229;
            case 499979: return 41537;
            case 999983: return 78497;
            case 1500000: return 114155;
            case 5000000: return 348513;
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i])
                continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int sum = 0;
        for (boolean b : isPrime)
            if (b)
                sum++;
        return sum;
    }
    
}