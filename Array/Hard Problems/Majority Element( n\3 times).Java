// Majority Element( n\3 times)
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Brute Force Approach
// T.C: O(N^2)    S.C: O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>(); //list of ans

        //Selected element is v[i]
        //Checking if nums[i] is not already a part of the ans
        for(int i =0; i<n; i++){
            if(ls.size() == 0 || ls.get(0) != nums[i]){
                int cnt = 0;
                for(int j =0; j<n; j++){
                    if(nums[j] == nums[i]) //if both i & j are equal increase the cnt
                    cnt++;
                }
            
                //Check if frequncy is greater than n/3
                if(cnt > n/3){
                    ls.add(nums[i]);
                }
            }
            /*list of majority element in ls must be of size < 2 because the total 
            occurrence of size > 2 will be greater than the size of array(let suppose 
            we have 3 majority element then 3 * 3 = 9 i.e greater than the size of array )*/
            if(ls.size() == 2) break;
        }
        return ls;  
    }
}

// Better Approach Using HashMap
// T.C: O(N^2)
// S.C: O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>(); //list of ans

        //declare a hashMap
        HashMap<Integer, Integer> mp = new HashMap<>();

        //least Occurrence of majority element
        int mini = (int) n/3 + 1;

        //Storing the element with its occurrence
        for(int i =0; i < n; i++){
            int value = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], value + 1);
        
        //Checking if nums[i] is the majority element
        if(mp.get(nums[i]) == mini){
            ls.add(nums[i]);
        } 

            /*list of majority element in ls must be of size < 2 because the total 
            occurrence of size > 2 will be greater than the size of array(let suppose 
            we have 3 majority element then 3 * 3 = 9 i.e greater than the size of array )*/
            if(ls.size() == 2) break;
        }
        return ls;  
    }
}
