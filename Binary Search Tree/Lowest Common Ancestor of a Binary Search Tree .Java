// Lowest Common Ancestor of a Binary Search Tree
// T.C :- O(Log N)    S.C :- O(H)

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            // if both q,p are grater then root then it will be in right. 
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }
              
            // if both p,q are smaller then ROOT then it will be in left. 
            else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }
            else {
                break;
            }
        }
        return root;  
    }
}
