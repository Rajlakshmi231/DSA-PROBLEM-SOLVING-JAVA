// Largest subarray with 0 sum
//T.C :- O(N)

class GfG {
    int maxLen(int arr[], int n) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int len =0;
        map.put(0, -1);
        
        for(int j =0; j<n ; j++){
            sum += arr[j];
            
            // If the current sum is 0, it means the subarray from the beginning to the current index has sum 0.
            if (sum == 0) {
                len = j + 1;
            }
            //If the sum is already in the map, it means the subarray between the previous index with the same sum and the current index has sum 0.
            else if(map.containsKey(sum)){
                len = Math.max(len, j - map.get(sum));
            }
            // Otherwise, store the sum and its corresponding index in the map.
            else{
                map.put(sum, j);
            }
        }
        return len;
    }
}



