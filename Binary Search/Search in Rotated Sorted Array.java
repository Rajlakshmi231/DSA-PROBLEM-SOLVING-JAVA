// Search in Rotated Sorted Array
// Time complexity: O(nlogn)

class Solution {
    public int search(int[] nums, int target) {
        int start =0, end = nums.length -1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            //left side sorted
            else if(nums[mid] >= nums[start]){
                if(nums[start] <= target &&  nums[mid] > target ){
                   end = mid - 1;
                } 
                else{
                    start = mid + 1;
                }
            }

            //rigth side sorted
            else{
                if(nums[end] >= target &&  nums[mid] < target ){
                   start = mid + 1;  
                } 
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;   
    }
}
