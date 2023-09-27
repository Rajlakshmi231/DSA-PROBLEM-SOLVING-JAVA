// Transform To Sum Tree

class Solution{
    public int transform(Node root){
        if(root == null){
            return 0;
        }
         
        int leftChild = transform(root.left);  
        int rightChild = transform(root.right); 
        
        int data = root.data;
        
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;   
    }
}
