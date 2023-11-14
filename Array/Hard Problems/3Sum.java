// 3Sum

// Approach 1 :- Brute Force Approach
// T.C :-O(N3 * log(no. of unique triplets)), where N = size of the array.
// S.C :- O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k =j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k] );
                        Collections.sort(triplet);
                        set.add(triplet);
                    } 
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;  
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Approach 2 :-  Better Approach
// T.C :- O(N2 * log(no. of unique triplets)), where N = size of the array.
// S.C :- O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N)
// for storing the array elements in another set.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;       
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------
 // Approach 3 :-  Optimal Approach
// T.C :- O(NlogN)+O(N2), where N = size of the array.
// S.C :- O(1).

  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;       
    }
}
