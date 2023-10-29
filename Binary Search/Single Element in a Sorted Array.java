// Single Element in a Sorted Array
// T.C:- O(logN)  S.C :- O(1)

class Solution {
    public int singleNonDuplicate(int[] nums) {

        // Edge cases:
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2])  return nums[n - 1];

        int start =1, end = n - 2;
        while(start <= end){
            int mid = start +(end- start)/2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid-1]) return nums[mid];

            // we are on left
            if( mid % 2 == 1 && nums[mid-1] == nums[mid] || mid % 2 == 0 && nums[mid+1] == nums[mid]){
                start = mid + 1;
            }
            // we are on left
            else{
                end = mid-1;
            }                
        }
        return -1;
    }
}
