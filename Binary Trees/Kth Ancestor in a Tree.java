// Kth Ancestor in a Tree

class Solution{
    public  int helper(Node root,int k, int node , int arr[]){
        
        if(root == null){
            return -1;
        }
        if(root.data == node){
            return 0;
        }
        int leftDist =helper(root.left, k, node, arr); 
        int rightDist =helper(root.right, k, node, arr);
        
        if(leftDist == -1 && rightDist == -1 ){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            // System.out.print(root.data);
            arr[0]=root.data;
        }
        return max+1;
    }
  
    public int kthAncestor(Node root, int k, int node) {
        int arr[]={-1};
        this.helper(root,k,node,arr);
        if(arr[0]>0){
            return arr[0];
        }
        return -1; 
    }
}
