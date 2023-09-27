// Search in a Binary Search Tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Check if the root node is null or if the root value matches the input value
        if(root == null){
            return null; // If so, return the root node (which may be null)
        }
        
       // If the input value is less than the root value, search the left subtree recursively
        if(root.val > val){
            return searchBST(root.left, val);
        }
        // Otherwise, search the right subtree recursively  
        else{
            return searchBST(root.right, val);
        }   
    }
}
