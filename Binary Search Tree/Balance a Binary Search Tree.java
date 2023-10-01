// Balance a Binary Search Tree

// T.C :- O(N)

class Solution {
    public void getInOrder(TreeNode root,  ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.val);
        getInOrder(root.right, inorder);
    }
    public TreeNode createBST(ArrayList<Integer> inorder, int st , int end){
        if(st > end){
            return null;
        }
        int mid = st + (end - st)/2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = createBST(inorder, st, mid -1 );
        root.right = createBST(inorder, mid + 1, end );
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        //Step1 :- Calculate inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);

        //Step2 :-  Convert Sorted inorder array to balanced bst
        return createBST(inorder, 0, inorder.size() - 1);   
    }
}
