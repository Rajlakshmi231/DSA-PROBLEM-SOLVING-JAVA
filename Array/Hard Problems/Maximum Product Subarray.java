// Maximum Product Subarray
//Approach 1 (Brute Force)
// T.C :- O(N3)     S.C :- O(1)

class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE; 
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
                int prod = 1;
                for(int k =i; k<=j; k++){
                    prod *= nums[k];
                    result = Math.max(prod, result);
                }
            }
        }
        return result;  
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Approach 2 (Better Approach)
// T.C :- O(N2)     S.C :- O(1) 

class Solution {
    public int maxProduct(int[] arr) {
      int result = arr[0];
      for(int i=0;i<arr.length-1;i++) {
          int prod = arr[i];
          for(int j=i+1;j<arr.length;j++) {
              result = Math.max(result,prod);
              prod *= arr[j];
          }
          result = Math.max(result,prod);
      }
      return result;    
    }
} 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//Approach 3 (Optimized Approach)
// T.C :- O(N)     S.C :- O(1)
class Solution {
    public int maxProduct(int[] nums) {
        int n =  nums.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *=  nums[i];
            suff *=  nums[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;    
    }
}    
  
  
