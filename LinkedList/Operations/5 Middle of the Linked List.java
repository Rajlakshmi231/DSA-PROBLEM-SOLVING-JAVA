// Middle of the Linked List
// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

// Slow-fast Approach 
// Time complexity: O(n)
// Space complexity:O(1)

class Solution {

    // Finding middle node using slow fast approach
    public ListNode findMid(ListNode head){
        ListNode slow = head; //+1
        ListNode fast = head; //+2
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is the midNode
    }
}
