 class Solution {
 	public int[][] intervalIntersection(int[][] A, int[][] B) {
 		int len = A.length + B.length;
 		if(len == 0) return new int[0][2];
 		int[][] arr = new int[len][2];
 		for(int i = 0; i < A.length; i++)   arr[i] = A[i];
 		for(int i = A.length; i < len; i++) arr[i] = B[i - A.length];
 		Arrays.sort(arr, (a, b)->{
 			return a[0] == b[0] ? a[1] - b[1]: a[0] - b[0];
 		});
 		int end = arr[0][1];
 		List<int[]> res = new ArrayList<>();
 		for(int i = 1; i < len; i++){
 			if(arr[i][0] <= end){
 				res.add(new int[]{arr[i][0], Math.min(arr[i][1], end)});
 			}
 			if(end < arr[i][1])
 				end = arr[i][1];
 		}
 		int size = res.size();
 		int[][] result = new int[size][2];
 		for(int i = 0; i < size; i++) result[i] = res.get(i);
 		return result;
 	}
 }