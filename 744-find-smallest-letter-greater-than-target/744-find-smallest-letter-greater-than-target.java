class Solution {
    public char nextGreatestLetter(char[] a, char x) {
       int n = a.length;
       
        if (x >= a[n - 1])   x = a[0];
        else    x++;
        
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x)    return a[mid];
            if (a[mid] < x)     lo = mid + 1;
            else    hi = mid;
        }
        return a[hi];
    }
}

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int lo = 0, hi = letters.length;
//         if(letters[hi-1]<= target)
//             return letters[0];
//         while(lo<=hi)
//         {
//             int mid = lo + (hi-lo)/2;
//             if(letters[mid] == target)
//             {
//                 if(letters[(mid+1)%letters.length] != letters[mid])
//                     return letters[(mid+1)%letters.length];
//                 else
//                     lo = mid+1;
//             }
//             else if(letters[mid] < target)
//                 lo = mid+1;
//             else
//                 hi = mid-1;
//         }
//         return letters[hi+1];
//     }
// }