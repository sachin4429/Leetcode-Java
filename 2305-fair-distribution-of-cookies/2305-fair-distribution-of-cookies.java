// class Solution {
//     public int distributeCookies(int[] cookies, int k) {
//         int start = cookies[0], end = 0;
//         for(int i : cookies)
//         {
//             start = Math.max(start,i);
//             end += i;
//         }
//         int res = -1;
//         while(start<=end)
//         {
//             int mid = start + (end-start)/2;
//             if(isvalid(cookies, cookies.length, k, mid))
//             {
//                 res = mid;
//                 end = mid-1;
//             }
//             else
//                 start = mid+1;
//         }
//         return res;
//     }
//     public boolean isvalid(int[]A, int n, int k, int mx)
//     {
//         int child = 1;
//         int sum = 0;
//         for(int i = 0; i<n ;i++)
//         {
//             sum += A[i];
//             if(sum>mx)
//             {
//                 child ++;
//                 sum = A[i];
//             }
//             if(child > k)
//                 return false;
//         }
//         return true;
//     }
// }

class Solution {
    // ans is the max cookies of any child
    // max answer is give all cookies to one child
    // min possible answer is largest cookie, it will be given to some child
    // binary search if we can asssign cookies so that every children's cookies is not greater than target
    // if we can, try a smaller number
    // if we cannot, try a larger number
    public int distributeCookies(int[] cookies, int k) {
        int sum = 0, max = 0;
        for (int c : cookies) {
            sum += c;
            max = Math.max(c, max);
        }
        
        int left = max, right = sum;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            int[] bags = new int[k];
            if (validate(cookies, 0, bags, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        
        int[] bags = new int[k];
        if (validate(cookies, 0, bags, left)) {
            return left;
        }
        return right;
    }
    
    private boolean validate(int[] cookies, int level, int[] bags, int target) {
        if (level == cookies.length) {
            return true;
        }
        
        for (int i = 0; i < bags.length; ++i) {
            if (bags[i] + cookies[level] > target) {
                continue;
            }
            if (i != 0 && level == 0) {
                break;
            }
            bags[i] += cookies[level];
            if (validate(cookies, level + 1, bags, target)) {
                return true;
            }
            bags[i] -= cookies[level];
            if (bags[i] == 0) {
                break;
            }
        }
        
        return false;
    }
}