// Palindrome Linked List
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.


class Solution {

    // Finding middle node using slow fast approach
    private ListNode findMid(ListNode head){
        ListNode slow = head; //+1
        ListNode fast = head; //+2
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is the midNode
    } 

    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        // Step1 :- find middle
        ListNode midNode = findMid(head);

        // step2 :- reverse 2nd half of ll
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev; //right half head
        ListNode left = head;

        // step3 :- Checkif 1st half == 2nd half
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;    
    }
}
