// Remove Duplicates from Sorted List
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 
// Time complexity: O(N)
// Space complexity: O(1)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next != null){
            if(temp.val == temp.next.val){
            temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }   
        }
        return head;  
    }
}
