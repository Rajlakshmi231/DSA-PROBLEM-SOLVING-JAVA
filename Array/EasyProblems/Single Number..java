// Find the number that appears once, and the other numbers twice
// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

// Naive Approach(Brute-force approach): 
// T.C :- O(N2)    S.C :- O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        //Run a loop for selecting elements:
        for(int i =0; i<n; i++){
            int num = nums[i];
            int cnt =0;
            
            //find the occurrence using linear search:
            for(int j=0; j<n; j++){
                if(nums[j] == num)
                    cnt++;
            }
           
            // if the occurrence is 1 return ans:
            if(cnt == 1) return num;
        }
        //This line will never execute, if the array contains a single element.
        return -1;
    }  
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Better Approach(Using Hashing using the map data structure): 
// T.C :-O(N*logM) + O(M)    S.C :- O(M) as we are using a map data structure. Here M = size of the map i.e. M = (N/2)+1.   
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
      
        // Declare the hashmap And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute, if the array contains a single element.
        return -1;   
    }
} 

----------------------------------------------------------------------------------------------------------------------------------------------------------------  

// Optimal Approach(Using XOR) :- 
// We will just perform the XOR of all elements of the array using a loop and the final XOR will be the answer.
// T.C :- O(N)    S.C :- O(1)  
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i =0; i< nums.length; i++){
            xor = xor^nums[i];
        }
        return xor;   
    }
}
