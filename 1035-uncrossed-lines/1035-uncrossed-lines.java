class Solution {
    public static int maxUncrossedLines(int[] A, int[] B) {
		
		int result = 0;
        
		int dpTable[][] = new int[A.length+1][B.length+1];
		
		for(int i=0;i<=A.length;i++)
			dpTable[i][0] = 0;
		
		for(int i=0;i<=B.length;i++)
			dpTable[0][i] = 0;
		
		for(int i=1;i<=A.length;i++) {
			for(int j=1;j<=B.length;j++) {
				
				if(A[i-1]==B[j-1]) {
					dpTable[i][j]=dpTable[i-1][j-1]+1;
				}else
					dpTable[i][j] = Math.max(dpTable[i-1][j], dpTable[i][j-1]);
			}
		}
        
        return dpTable[A.length][B.length];
    }
}