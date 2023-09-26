// Insert a Node into a Binary Search Tree

// public class BST {
//   static classs Node{
//     int val;
//     Node left;
//     Node right;

//     Node(int data){
//       this.val = val;
//     }
//   }

  public Node insertIntoBST(Node root, int val) {
      if(root == null){ //if the node we are inserting is the first node
          root = new Node(val);
          return root;
      }
      if(root.val > val){
          //insert in left subtree
          root.left = insertIntoBST(root.left, val);
      }
      else{
          //inser in right subtree
         root.right =  insertIntoBST(root.right, val);
      }
      return root;   
  }
}
