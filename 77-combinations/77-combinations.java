class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
		result = new ArrayList<>();
		combine(new ArrayList<>(), 1, n, k);
		return result;
	}
	public void combine(List<Integer> comb, int start, int n, int k) {
		if(k == 0) {
			result.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<= n-k + 1;i++) {
			comb.add(i);
			combine(comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}
}