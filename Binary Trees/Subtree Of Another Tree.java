// Subtree Of Another Tree

class Solution {
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //base case
        if(root == null){
            return false;
        }

        //compare root.data with subroot.data if both data are same then we check for Identical nodes using helper function
        if(root.val == subRoot.val){ 
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        //chech in left and right for subTree
        return isSubtree(root.left, subRoot.left) ||isSubtree(root.right, subRoot.right) ;    
    }
}
