// Min distance between two given nodes of a Binary Tree

class GfG {
    //lca function
    Node lca(Node root, int n1, int n2){
  		if(root== null || root.data == n1 || root.data == n2){
  		    return root;
  		}
  		Node leftLca = lca(root.left, n1, n2); 
  		Node rightLca = lca(root.right, n1, n2);
  		
  		if(rightLca == null){
  		    return leftLca;
  		}
  		if(leftLca == null){
  		    return rightLca;
  		}
  		return root;
	}
  
	int lcaDist(Node root, int n){
	    if(root == null){
	        return -1;
	    }
	    if(root.data == n){
	        return 0;
	    }
	    int leftDist = lcaDist(root.left,n);
	    int rightDist = lcaDist(root.right, n);
	    
	    if(leftDist == -1 && rightDist == -1 ){
	        return -1;  //node doesnot exist in the tree
	    }
	    else if(leftDist == -1){
	        return rightDist + 1; //valid node is present in right 
	    }
	    else{
	        return leftDist + 1; //valid node is present in left
	    }
	    
	}
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca1 = lca(root, a, b);
        int dist1 = lcaDist(lca1, a); //distance from lca to a
        int dist2 = lcaDist(lca1, b); //distance from lca to b
        
        return dist1 + dist2; //min distance between a & b

    }
}
