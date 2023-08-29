// Interleave the First Half of the Queue with Second Half
// You are given a queue Q of N integers of even length, rearrange the elements by interleaving the first half of the queue with the second half of the queue.

// Steps to solve : 
// 1.Make a temporary queue and push the first half of the original queue into the temp queue.
// 2.Till the temp queue is empty
    // !.Pop the front of the temp queue and push it to the original queue
    // 2.Pop the front of the original queue and push it to the original queue
// 3.The original queue is converted to the interleaved queue.

// Time complexity: O(n)  
// Auxiliary Space: O(n).

class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
       
       
       //step 1: pushing first half in queue
       for(int i =0; i< N/2; i++){
           firstHalf.add(q.remove());
       }
       while(!firstHalf.isEmpty()){
        //remove from firstHalf and add in original queue
           q.add(firstHalf.remove());
        //remove from q and add in and add in q   
           q.add(q.remove());
           
       }
       while(!q.isEmpty()){
            arr.add(q.remove());
        }
        return arr;
    }
}

// Approach2 using stack with same time complexity
      
