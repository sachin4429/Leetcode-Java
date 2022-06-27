class Solution {
    public int dayOfYear(String date) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(31);
        arr.add(28);
        arr.add(31);
        arr.add(30);
        arr.add(31);
        arr.add(30);
        arr.add(31);
        arr.add(31);
        arr.add(30);
        arr.add(31);
        arr.add(30);
        arr.add(31);
        int ans = 0;
        String[] arrOfStr = date.split("-");
        if(Integer.parseInt(arrOfStr[1])==1)
        {
            return Integer.parseInt(arrOfStr[2]);
        }
        else
        {
            for(int i = 0; i<Integer.parseInt(arrOfStr[1])-1; i++)
                ans+=arr.get(i);
                ans += Integer.parseInt(arrOfStr[2]);
        }
        if(Integer.parseInt(arrOfStr[1]) > 2 && isleap(Integer.parseInt(arrOfStr[0])))
            return ans+1;
        else 
            return ans;
            
    }
    public boolean isleap(int year)
    {
      boolean is_leap_year = false;
 
        if (year % 4 == 0) 
        {
          is_leap_year = true;
            if (year % 100 == 0) 
            {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        return is_leap_year;
    }
}