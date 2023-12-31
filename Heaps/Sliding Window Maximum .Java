// Sliding Window Maximum
//Using PriorityQueue   T.C :- O(NlogK)

class Solution {
    public class Pair implements Comparable<Pair>{
        int num;
        int idx;

        public Pair(int num, int idx){
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            // return this.num - p2.num;   sort in ascending order
            return p2.num - this.num ; //sort in decending order
        }
    } 
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int res[] = new int [nums.length- k + 1]; //n-k+1
        
        // 1st window
        for(int i =0; i<k; i++){
            pq.add(new Pair(nums[i], i));
        }
        res[0] = pq.peek().num;
        for(int i =k; i<nums.length; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i], i));
            res[i - k + 1] = pq.peek().num;
        }
        return res;   
    }
}
