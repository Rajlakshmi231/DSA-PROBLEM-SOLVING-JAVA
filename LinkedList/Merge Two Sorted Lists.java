// Merge Two Sorted Lists
//Problem Statement:- You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list. 
// The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.


// Approach 1 :-
// Prerequsite:- Merge two sorted array
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2 ;
        }
        else{
            temp.next = temp1;
        }
        return head.next;    
    }
}


// Approach 2 :- without using extra space
// T.C:- O(m + n), where m and n are the lengths of list1 and list2 respectively, as we iterate through both lists once.
// S.C:- O(1), as we are only using a constant amount of extra space for the dummy node and the head pointer


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode h = new ListNode(100);
        ListNode t = h;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                t.next = t1; //connect to min val
                t = t1;   //move t to the min val place
                t1 = t1.next; //move t1 to next position
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
                
            }
        }
        if(t1 == null){
            t.next = t2 ;
        }
        else{
            t.next = t1;
        }
        return h.next;    
    }
}
