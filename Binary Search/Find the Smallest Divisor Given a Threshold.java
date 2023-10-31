// Find the Smallest Divisor Given a Threshold
// T.C :- O(log(max(arr[]))*N), where max(arr[]) = maximum element in the array, N = size of the array.
// Reason: We are applying binary search on our answers that are in the range of [1, max(arr[])]. For every possible divisor ‘mid’, we call the sumByD() function. 
// Inside that function,  we are traversing the entire array, which results in O(N).
// S.C :- O(1)

class Solution {
    public static int sumByD(int[] arr, int div) {
        int n = arr.length; //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length; //size of array.
        if(n > threshold) return -1;

        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        
        int start = 1, end = maxi , ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (sumByD(nums, mid) <= threshold) {
                end = mid - 1;
            } else {
               start = mid + 1;
            }
        }
        return start;
    }
}
