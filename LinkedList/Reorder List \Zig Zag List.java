 // Reorder List\Zig Zag List

// You are given the head of a singly linked-list. The list can be represented as:
// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:
// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// In this question we basically, do three steps:
// 1). Find the Midddle element(slow & fast Algo).
// 2). 2nd half reverse.
// 3). Alternate merging.

class Solution {
    public void reorderList(ListNode head) {

        // Step1:- Find mid node
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        // Step2:- Reverse 2nd half
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
           
        }
        ListNode left = head; //left half's head
        ListNode right = prev; //right half's head
        ListNode nextL, nextR;

        // Step3:- Alternate merging / Zig Zag Merging
        while(left != null && right != null){
            nextL = left.next; //steps for zig zig merging
            left.next = right;
            nextR  = right.next;
            right.next = nextL;

            left = nextL; //updation
            right = nextR;
        }   
    }
}
