// Inorder Traversal 
//In Inorder root comes in between

// T.C :- O(N)
// S.C :- O(N)

// Processing Order In inorder Traversal (follow these process recursively)
//1) left subtree
//2) root 
//3)right subtree

class Solution {
    public void inorder(TreeNode root,List<Integer> ans ){
        if(root == null){
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;   
    }
}
