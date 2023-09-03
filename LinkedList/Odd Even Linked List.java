// Odd Even Linked List

//Problem Statement:- Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempO = odd;
        ListNode tempE = even;
        ListNode temp = head;

        while(temp != null){
            tempO.next = temp;
            temp = temp.next;
            tempO = tempO.next;

            tempE.next = temp;
            if(temp == null) break;
            temp = temp.next;
            tempE = tempE.next;
        }
        odd = odd.next;
        even = even.next;
        tempO.next = even;
        return odd;
    }
}
