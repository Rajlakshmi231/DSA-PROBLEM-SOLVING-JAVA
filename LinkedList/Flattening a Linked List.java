// Flattening a Linked List

// The process to flatten the given linked list is as follows:-

// We will recurse until the head pointer moves null. The main motive is to merge each list from the last.
// Merge each list chosen using the merge algorithm. The steps are
// Create a dummy node. Point two pointers, i.e, temp and res on dummy node. res is to keep track of dummy node and temp pointer is to
// move ahead as we build the flattened list.
// We iterate through the two chosen list. Move head from any of the chosen lists ahead whose current pointed node is smaller. 
// Return the new flattened list found.


// T.C:- O(N), where N is the total number of nodes present [Reason: We are visiting all the nodes present in the given list.]
// S.C:- O(1)

class GfG
{
    Node mergeTwoLists(Node a, Node b){
        Node temp = new Node(0);
        Node res = temp;
        
        while(a != null && b != null){
            if(a.data < b.data){
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else{
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }
        if(a != null) temp.bottom = a;
        else temp.bottom = b;
        return res.bottom;
    }
    
    Node flatten(Node root)
    {
        if(root == null || root.next == null){
            return root;
        }
        // recusion call for list on right
        root.next = flatten(root.next);
        
        // now merge 
        root = mergeTwoLists(root, root.next);
        
        // return the root
        // it will in turn merge with its left
        return root;
	
    }
}
