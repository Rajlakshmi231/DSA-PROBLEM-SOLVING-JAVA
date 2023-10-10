// Validate Binary Search Tree
// T.C :- O(N)   S.C :- O(H)

class Solution {
  
    public boolean validBST(TreeNode root, TreeNode min, TreeNode max ){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min.val){
            return false;
        }
        else if(max != null && root.val >= max.val){
            return false;
        }
        return validBST(root.left, min, root) && validBST(root.right, root, max); 
    }
  
    public boolean isValidBST(TreeNode root) {
       return validBST(root, null, null);     
    }
}
