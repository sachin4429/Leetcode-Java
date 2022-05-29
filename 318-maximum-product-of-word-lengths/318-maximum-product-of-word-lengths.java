class Solution {
    public int maxProduct(String[] words) {
        
        int[] checker = new int[words.length];
		int max = 0;
		for (int i = 0; i < checker.length; i++) {
			int num = 0;
			for (int j = 0; j < words[i].length(); j++) {
				num |= 1 << (words[i].charAt(j) - 'a');
			}
			checker[i] = num;
		}

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if ((checker[i] & checker[j]) == 0)
					max = Math.max(max, words[i].length() * words[j].length());
			}
		}
		return max;
        
    }
}