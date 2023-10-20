// Search Insert Position
// T.C :- O(log n)   S.C :- O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s =0 , e = nums.length - 1;
        int ansIdx = nums.length;
        while(s <= e){
            int mid = s + (e-s)/2;
            //if target is found in mid position of array we return it or else we continue traversing it.
            if(nums[mid] == target){  
                ansIdx = mid; 
                break;
            }
            else if(nums[mid] > target){
                ansIdx = mid; // maybe an answer
                e = mid - 1; //look for smaller index on the left
            }
            else{
                s = mid + 1; // look on the right
            }
        }
        return ansIdx;   
    }
}
