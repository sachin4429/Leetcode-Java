class Solution {
    public String orderlyQueue(String S, int K) {
        if (K > 1) {
            char[] chars = S.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        String rst = S;
        for (int i = 1; i < S.length(); i++) {
            String temp = S.substring(i) + S.substring(0, i);
            if (rst.compareTo(temp) > 0) {
                rst = temp;
            }
        }
        return rst;
    }
}