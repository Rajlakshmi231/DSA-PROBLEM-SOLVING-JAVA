// Remove duplicates from an unsorted linked list

// Approach3:- Using HashSet
// T.C = O(N)  S.C = O(N)


class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        if(head == null || head.next == null) return head;
  
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            if(set.contains(temp.data)) {
                //duplicate data in curr (delete curr)
                prev.next = temp.next;
            } else {
                // new data add in set
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
         
        return head;
    }
}
