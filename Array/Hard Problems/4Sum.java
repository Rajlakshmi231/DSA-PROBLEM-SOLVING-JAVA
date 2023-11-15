// 4 Sum
// Approach 1 :- Naive Approach (Brute-force)
// T.C :- O(N4), where N = size of the array.
// S.C :- O(2 * no. of the quadruplets) as we are using a set data structure and a list to store the quads.

import java.util.*;
public class tUf {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        Set<List<Integer>> set = new HashSet<>();

        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        // taking bigger data type
                        // to avoid integer overflow:
                        long sum = (long)nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];

                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach 2 :- Better Approach (Using 3 loops and set data structure)
// T.C :-  O(N3*log(M)), where N = size of the array, M = no. of elements in the set.
// S.C :- O(2 * no. of the quadruplets)+O(N)

import java.util.*;

public class tUf {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        Set<List<Integer>> st = new HashSet<>();

        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    // taking bigger data type
                    // to avoid integer overflow:
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if (hashset.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    // put the kth element into the hashset:
                    hashset.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

---------------------------------------------------------------------------------------------------------------------------------------------------------------

// Approach 3 :- Optimal Approach 
// T.C :-  O(N3), where N = size of the array.  Reason: Each of the pointers i and j, is running for approximately N times. And both the pointers k and l
// combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N3). 
// S.C :- O(1).
  
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        // sort the given array
        Arrays.sort(nums);

        // calculating the quadruplets:
        for(int i =0; i<n ; i++){
            // avoid the duplicates while moving i:
            if(i >0 && nums[i] == nums[i-1]) continue;
            for(int j = i +1; j<n ; j++){
                // avoid the duplicates while moving j:
                if(j != i+1 && nums[j] == nums[j-1]) continue; 

                int k = j+1;  //starts from j + 1
                int l = n-1; //starts from last index
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum == target){
                        List<Integer> quadruplets = new ArrayList<>();
                        quadruplets.add(nums[i]); 
                        quadruplets.add(nums[j]); 
                        quadruplets.add(nums[k]); 
                        quadruplets.add(nums[l]); 
                        ans.add(quadruplets);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }  
            }
        }
        return ans;     
    }
}
