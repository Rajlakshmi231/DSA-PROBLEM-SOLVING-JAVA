// Reverse a Doubly Linked List
// Given a doubly linked list of n elements. The task is to reverse the doubly linked list.


public static Node reverseDLL(Node  head){
    Node curr = head;
    Node prev = null;
    Node next;
    
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next; 
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;
}
