class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> hs = new HashSet<Integer>();
	    //int cn = 0,cs = 0;
          for(int num : arr)
          {
              hs.add(num);
          }
        int ls = 0;
          for(int num : arr)
          {
              if(!hs.contains(num-1))
              {
                  int cn = num;
                  int cs = 1;

                  while(hs.contains(cn+1))
                  {
                      cn += 1;
                      cs += 1;
                  }
                  ls= Math.max(ls,cs);
              }
          }
      return ls;
    }
}