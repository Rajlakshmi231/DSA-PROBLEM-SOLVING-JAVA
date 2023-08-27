// Remove Nth Node From End of List
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Iterative Approach

// Approach:- 1
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
      // prev is present at size - n
        int i = 1;
        int iToFind = size - n; 
        ListNode prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}


// Approach:-2 In one traversal (same t.c but in one traversal)
class LinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode slow = head;
      ListNode fast = head;
      for(int i = 0; i <= n; i++){ //till the nth position which we want to delete
        fast = fast.next;
      }
      if(fast == null){  //if we reach the nth node and fast is null at this point then nth node which we want to is the head node.
        head = head.next;
        return head;
      }

      while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
      }
      // return slow finding the nth node
      slow.next = slow.next.next; //deleting the node
      return head;  
    }
}


