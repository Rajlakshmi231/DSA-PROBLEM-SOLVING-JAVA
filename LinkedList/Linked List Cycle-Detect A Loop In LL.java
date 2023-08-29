// Linked List Cycle/ Detect A Loop In LL 
// Problem Statement:- Given head, the head of a linked list, determine if the linked list has a cycle in it.
// Return true if there is a cycle in the linked list. Otherwise, return false.

// Time complexity:- 0(n)
// Space complexity:- constant time

//Also Known as Floyd's cycle detection algorithm
// using two pointer approach slow and fast.

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){  //if slow == fast then there is a cycle
                return true;
            }
        }
        return false;   
    }
}
