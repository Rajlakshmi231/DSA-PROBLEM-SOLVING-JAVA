// Reverse Linked List 
// Problem Statement:- Given the head of a singly linked list, reverse the list, and return the reversed list. 

// Iterative Approach 
// Time.Complexity:= O(N)
// Space.Complexity:= O(1)

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



// Recursive Approach
// Time.Complexity:= O(N)
// Space.Complexity:= O(N) stack space in each call

class Solution {
    public ListNode reverse(ListNode head){
        // base case
        if(head == null || head.next == null){
            return head;
        }
        ListNode smallHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return smallHead;
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head);  
    }
}


