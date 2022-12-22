class Solution {
    public int bestClosingTime(String s) {
        int n=s.length();
        int ind=-1,mxscore=0,score=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='Y') score++;
            else score--;
            if(score>mxscore){
                mxscore=score;
                ind=i;
            }
        }
        return ind+1;
        
    }
}