class Solution {
    public int countTexts(String pressedKeys) {
        int[] memo=new int[pressedKeys.length()];
        return dfs(pressedKeys,memo,0);
    }
    
    public int dfs(String pk,int[] memo,int index){
        if(index==pk.length())
            return 1;
        
        if(memo[index]!=0) 
            return memo[index];
        
        int count=0;
        for(int i=0;i<4;i++)
        {
            if(pk.charAt(index)!='7' && pk.charAt(index)!='9' && i==3)  
                break;
            
            if(index+i>=pk.length())
                break;
              
            if(i!=0)
            {
                
                if(pk.charAt(index+i)!=pk.charAt(index+i-1))    
                    break;
            }
            
            count+=dfs(pk,memo,index+i+1);
            count%=1000000007;
                
        }
        
        memo[index]=count;
        return count;
    }
}