// Find Peak Element
// A peak element is an element that is strictly greater than its neighbors.

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
   
          if((mid == 0 || nums[mid]>= nums[mid - 1]) &&
             (mid == nums.length-1 || nums[mid]>= nums[mid + 1])){
                return mid;  
          }
          else if (nums[mid]<=nums[mid +1]){
              start =mid +1;
          }
          else{
              end = mid -1;
          }    
        }
        return -1;   
    }
}


//Solution 2 :-
T.C :- O(logN)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s =0, e = arr.length - 1;
        
        while(s <= e){
            int mid = e +(s-e)/2;

            //case1 :- Check mid is peak element 
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case2 :- right side move
            else if(arr[mid] > arr[mid - 1]){
                s = mid + 1;
            }
            // case2 :- left side move 
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
