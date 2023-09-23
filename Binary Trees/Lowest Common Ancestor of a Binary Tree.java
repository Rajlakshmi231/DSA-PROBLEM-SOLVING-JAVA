 // Lowest Common Ancestor of a Binary Tree

// T.C :- O(N)
// S.C :- O(N)

class Solution {
    public static boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        
        if(root.val == n.val){
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }
        //when both left & right return false then remove that element & return false to above call
        path.remove(path.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root, p, path1);
        getPath(root, q, path2);

        //last common ancestor
        int i =0;
        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last equal node -> i-1th
        TreeNode lca = path1.get(i - 1);
        return lca;    
    }
}
