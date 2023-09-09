// Left Rotate Array By K Places
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n ==0) return;

      // Get the effective number of rotation
        k = k % n;   //if(k % n == 0 therefore, rotated array = given array ,  where k = no. of rotation &  n = size of array 

        reverse(nums, 0, n-k-1); //step1
        reverse(nums, n-k, n-1); //step2
        reverse(nums, 0, n-1);   //step3
    }
}
