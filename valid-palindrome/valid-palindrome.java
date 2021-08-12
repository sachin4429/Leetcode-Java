class Solution {
    public boolean isPalindrome(String s) {
       String SB=s.toUpperCase();
        s="";
        for(int i=0; i<SB.length(); i++)
		{
			if((int)SB.charAt(i)>=65 && (int)SB.charAt(i)<=90 || Character.isDigit(SB.charAt(i)))
			{
				s = s+SB.charAt(i);
			}
		}
        StringBuilder RSB = new StringBuilder(s);
        RSB = RSB.reverse();
        
        System.out.println(s+" "+RSB.toString());
       
        if(s.equals(RSB.toString()))
            return true;
        else 
            return false;
        
           
    }
}