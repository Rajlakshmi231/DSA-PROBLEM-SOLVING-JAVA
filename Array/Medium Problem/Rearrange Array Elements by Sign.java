// Approach 1 :- Brute Force Method
// T.C :- O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.
// S.C :-  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;  
        // Define 2 arrays, one for storing positive and other for negative elements of the array.
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        // Segregate the array into positives and negatives.
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        
        // Positives on even indices, negatives on odd.
        for(int i=0;i<n/2;i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
        return nums;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

  // Approach 2 :-  Optimal Approach
// T.C :- O(N) { O(N) for traversing the array once and substituting positives and negatives simultaneously using pointers, where N = size of the array A}.
// S.C :-  O(N) { Extra Space used to store the rearranged elements separately in an array, where N = size of array A}
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        // positive elements start from 0 and negative from 1.
        int posIdx =0, negIdx =1;

        for(int i =0; i<n; i++){
            // Fill negative elements in odd indices and inc by 2.
            if(nums[i] < 0){
                ans[negIdx] = nums[i];
                negIdx +=2;
            }
            // Fill positive elements in odd indices and inc by 2.
            else{
                ans[posIdx] = nums[i];
                posIdx +=2;
            }     
        }
        return ans;    
    }
}
