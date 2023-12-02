// Max Consecutive Ones
// T.C:- O(N) since the solution involves only a single pass.
// S.C :- O(1) because no extra space is used.
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0; 
        int cnt =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cnt++;
                max = Math.max(max, cnt);
            }
            else{
                cnt = 0;
            }
        }
        return max;
    }
}
