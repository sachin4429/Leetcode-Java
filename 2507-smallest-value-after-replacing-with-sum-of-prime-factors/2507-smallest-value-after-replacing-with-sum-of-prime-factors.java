class Solution {
    public int smallestValue(int n) {
    if(n == 4) return 4;
     List<Integer> arr = PrimeFactor(n);
     int sum = 0;
     if(arr.size()==1)
         return arr.get(0);
     else
     {
         for(int i : arr)
             sum += i;
     }
     return smallestValue(sum);
    }
    
    
    public List<Integer> PrimeFactor(int number) {
     List<Integer> arr = new ArrayList<>();
      for(int i = 2; i< number; i++) 
      {
         while(number%i == 0) 
         {
            arr.add(i);
            number = number/i;
         }
      }
      if(number >=2) {
         arr.add(number);
      }
        return arr; 
    }
    
    
}