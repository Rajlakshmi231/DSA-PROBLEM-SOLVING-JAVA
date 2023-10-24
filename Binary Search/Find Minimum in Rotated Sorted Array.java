// Find Minimum in Rotated Sorted Array

//T.C :- O(logn)    S.C :- O(1) 

class Solution {
    public int findMin(int[] nums) {
        int s =0, e = nums.length-1,  ans = nums[0];
        while(s <= e){
            int mid = s + (e -s)/2;

            //left side sorted array
            if(nums[mid] >= nums[0]){
                s = mid +1;
            }

            //right side sorted array
            else{
                ans = nums[mid];
                e = mid - 1;
            }
        }
        return ans;
    }
}
