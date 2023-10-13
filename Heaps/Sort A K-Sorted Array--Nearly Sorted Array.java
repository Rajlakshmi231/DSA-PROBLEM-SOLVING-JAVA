// Sort A K-Sorted Array--Nearle Sorted Array 

class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList <Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<num; i++){
            pq.add(arr[i]);
            
            if(pq.size() > k){
                ans.add(pq.remove());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
    }
}
