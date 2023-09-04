// Given a linked list of 0s, 1s and 2s, sort it
// Problem Statement:- Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s 
// linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s

// Approach1 :-
// T.C = 0(N)  S.C = 0(1)
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        
        Node temp = head;
        while(temp!= null){
        
            if(temp.data == 0){
                zeroCount++;
            }
            else if(temp.data == 1){
                oneCount++;
            }
            else if(temp.data == 2){
                twoCount++;
            }
            
            temp = temp.next;
        }
    
        temp = head;
        while(temp != null){
            if(zeroCount != 0){
                temp.data = 0;
                zeroCount--;
            }
            else if(oneCount != 0){
                temp.data = 1;
                oneCount--;
            }
            else if(twoCount != 0){
                temp.data = 2;
                twoCount--;
            }
            temp = temp.next;
        }
        return head;
    }
}


// Approach2 :-Data replacement is not allowed (sort by changing the links)
// T.C = 0(N)  S.C = 0(1)

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head.next == null) return head;
        
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        
        Node temp = head;
        
        // Step1:- Create Seperate list of 0s, 1s and 2s
        while(temp != null){
            if(temp.data == 0){
                zeroTail.next = temp;
                zeroTail = temp;
            }
            else if(temp.data == 1){
                oneTail.next = temp;
                oneTail = temp;    
            }
            else if(temp.data == 2){
                twoTail.next = temp;
                twoTail = temp;    
            }
            temp = temp.next;
        }
        
        
        // Step2:- Merge the above 3 sublist
        
        // 1s list is not empty
        if(oneHead.next != null){
            zeroTail.next = oneHead.next;
        }
        // 1s empty
        else{
            zeroTail.next = twoHead.next;
        }
        oneTail.next = twoHead.next;
        twoTail.next = null;
        
        // Update head
        head = zeroHead.next;
        return head;
    }
}
