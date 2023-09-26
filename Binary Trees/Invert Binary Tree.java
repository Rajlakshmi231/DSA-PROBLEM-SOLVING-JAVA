// Invert Binary Tree

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        // swap the left right nodes
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
      // once done at root level, keep doing it at child nodes
        invertTree(root.left);
        invertTree(root.right);
        return root;   
    }
}
