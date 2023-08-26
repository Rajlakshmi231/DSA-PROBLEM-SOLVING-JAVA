// Intersection of Two Linked Lists.java
// Time Complexity: O(A + B) where A and B are the lengths of each linked list.
// Space Complexity: O(1)
  
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
  
        while(tempA != null){
            sizeA++; 
            tempA = tempA.next;
            
        }
        int sizeB =0;
        while(tempB != null){
            sizeB++;
            tempB = tempB.next;
             
        }
        tempA = headA;
        tempB = headB;

        if(sizeA > sizeB){
            for(int i =1; i<=sizeA - sizeB; i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i =1; i<=sizeB - sizeA; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
         
    }
}
