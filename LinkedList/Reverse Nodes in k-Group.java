// Reverse Nodes in k-Group
//Problem Statement:- Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes 
// is not a multiple of k then left-out nodes, in the end, should remain as it is.
// You may not alter the values in the list's nodes, only nodes themselves may be changed.


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;

        while(temp!= null){
            temp = temp.next;
            size++;
        }
        if(size < k)
        return head;  /* just add this new part in code so that, when number of nodes is 
                        not a multiple of k, the left over ones are not to be reversed.*/
        if(head == null){
        return null;
    }


        // Base Case
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count = 0;

        // Step1:- reverse 1 K nodes
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Step2:- recursion will reverse the remaining group of nodes
        if(next != null){
            head.next = reverseKGroup( next, k); 
        }

        // Step3:- Return head of reverse list
        return prev;

        
    }
}
