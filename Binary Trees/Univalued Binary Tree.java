// // Univalued Binary Tree

// Approach :-The algorithm is to check if the root value of a tree is equal to its left and right child. If it's not, then return false.

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left != null && root.val != root.left.val)
        return false;
        if(root.right != null && root.val != root.right.val)
        return false;

        return isUnivalTree(root.left) && isUnivalTree(root.right);   
    }
}
