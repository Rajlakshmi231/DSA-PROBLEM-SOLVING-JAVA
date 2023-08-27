// Reverse Linked List 
// Problem Statement:- Given the head of a singly linked list, reverse the list, and return the reversed list. 
class LinkedList {
    public ListNode reverseList(ListNode head) { 
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        head = prev; //Update head node 
        return head;  
    }
}

// Time.Complexity:= O(N)
