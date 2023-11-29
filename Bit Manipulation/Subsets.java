// Subsets
// T.C :- O(2^n * n)    Reason: O(2^n) for the outer for loop and O(n) for the inner for loop.
// S.C :- O(1)

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    int n = nums.length;
	  List<List<Integer>> ans = new ArrayList<>();

  	for (int num = 0; num < (1 << n); num++) {
        List<Integer> sub = new ArrayList<>();
    		for (int i = 0; i < n; i++) {
    			//check if the ith bit is set or not
    			if ((num & (1 << i))!=0) {
    				sub.add(nums[i]);
    			}
    		}
    		if (sub.size() >= 0) {
    			ans.add(sub);
    		}
  	}
	  return ans;   
    }
}
