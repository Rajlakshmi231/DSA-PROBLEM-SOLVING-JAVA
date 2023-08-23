// Remove Nth Node From End of List
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Iterative Approach

// Time complexity:
// O(N) for the loop to calculate the sz of the LL
// O(N) for searching the position of the Node in while loop
// O(1) for connecting the LL by skipping the Nth From End Node
// which simplifies to O(N).
// Space complexity:O(1)
  
class LinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        ListNode temp = head;
        while(temp != null){
            temp= temp.next;
            size++;
        }

        if(n == size ){
            head = head.next; //RemoveFirst (one node is given)
            return head;
        }
      // prev is present at size -n
        int i = 1;
        int iToFind = size -n; 
        ListNode prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}
