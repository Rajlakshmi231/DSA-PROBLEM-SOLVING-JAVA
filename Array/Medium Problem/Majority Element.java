// Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


// Brute Force Approach       T.C :- O(N)       S.C :- O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for(int i =0; i<n; i++){
            int cnt =0;
            for(int j =0; j<n; j++){
                if(nums[j] == nums[i]){
                    cnt++;
                }
            }
            if(cnt > (n/2)){
                return nums[i];

            }
        }
        return -1;
    }
}
