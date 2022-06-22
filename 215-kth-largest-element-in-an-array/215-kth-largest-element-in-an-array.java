class Solution {
	public int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++){
			if(k!=0){
				pq.add(arr[i]);
				k--;
			}
			else{
				if(pq.peek()<arr[i]){
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		return pq.peek();
	
    }
}