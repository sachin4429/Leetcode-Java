/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Start
        
        if(isBadVersion(1) == true)
            return 1;
        int lo = 2;
        int hi = n;
        while(lo<=hi)
        {
            int mid  = lo + (hi-lo)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)
                return mid;
            else if(isBadVersion(mid)==false && isBadVersion(mid-1)==false)
            {
                lo = mid+1;
            }
            else if(isBadVersion(mid)==true && isBadVersion(mid-1)==true)
                hi = mid - 1;
        }
        return -1;
        
        //End
    }
}