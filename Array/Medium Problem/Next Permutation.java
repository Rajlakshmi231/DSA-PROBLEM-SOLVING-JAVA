// Next Permutation

// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the 
// array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the 
// sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// T.C :- O(3N), where N = size of the given array
// S.C :- Since no extra storage is required. Thus, its space complexity is O(1).

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; // size of the array.

        // Step 1: Find the break point:
        int index = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                // index i is the break point
                index = i;
                break;
            }
        }

        // If break point does not exist:
        if (index == -1) {
            // reverse the whole array:
            reverse(nums, 0, n-1);
            return;
        }

        // Step 2: Find the next greater element and swap it with arr[index]:
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp =nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 3: reverse the right half:
        reverse( nums, index+1, n-1);
    }

  //reverse function
    void reverse(int[] nums, int i, int j) {
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
  
}
