class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sa = 0, sb = 0;
        for(int i: A)
            sa += i;
        for(int i: B)
            sb += i;
        int dif = (sa - sb) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) 
        {
            if (S.contains(b + dif)) 
                return new int[] {b + dif, b};
        }
        return null;
    }
}