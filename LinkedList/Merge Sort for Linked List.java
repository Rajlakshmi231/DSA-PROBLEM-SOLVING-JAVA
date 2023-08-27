// Merge Sort for Linked List
// problem Statment :- Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
// Approach:-
//Step1:- Find Mid
//Step2:- Divide LL into two halves then  Sort the two halves right and left.
       // MergeSort(right);
      // MergeSort(left);
//Step3:- Merge the sorted halves right and left.

// Time Complexity: O(n*log n)
// Space Complexit: O(n)


class Solution
{
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;//to make mid 1st half's last node in even case
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }
    
    private static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
            
        }
        return mergedLL.next;
    }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
      // Base case : if head is null
        if(head == null || head.next == null){
            return head;
        }
        //Step1:- Find Mid
        Node mid = getMid(head);
        
        //Step2:- Left & right(Divide into two parts then call mergeSort) Mergesort
        Node rightHead = mid.next; 
        mid.next = null;
        
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        //Step3:- Merge 
        return merge(newLeft, newRight);
        
    }

}
