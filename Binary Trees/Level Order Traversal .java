// Level Order Traversal
//T.C :- O(N)

 public static void levelOrder(Node root){
    if(root == null){
        return ;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root); //add root at the start
    q.add(null); //add null to seperate level 

    while(!q.isEmpty()){
        Node currNode  = q.remove(); //remove nodes one by one
        
        if(currNode == null){  //if the curr node is null then simply move to nextline
            System.out.println();
            if(q.isEmpty()){ //after null if the queue is empty simply break from the loop
                break;
            }
            else{
                q.add(null); //after null queue is not empty then add the null again in the queue
            }
        }
        else{
            System.out.println(currNode.data + " "); //print the data
            
             //Adding left child in the Queue
            if(currNode.left != null){
                q.add(currNode.left);
            }
            //Adding right child in the Queue
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }
}
