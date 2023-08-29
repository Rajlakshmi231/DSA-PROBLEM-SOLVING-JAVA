// Delete Middle of Linked List
// You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

// Slow-fast Pointer Approach
// T.C:-O(N)
// S.C:-O(1)

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){ //Single element
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;   
    }
}



//Approach 2
// T.C:-O(N)
// S.C:-O(1)

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1){
            head=head.next;
            return head;
        }
        
        ListNode prev=head;
        for(int i=0; i<(size/2)-1; i++){
            prev=prev.next;
        }
      
          prev.next=prev.next.next;
        
          return head;
    }
}
