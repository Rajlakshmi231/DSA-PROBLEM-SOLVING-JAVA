// Sum of Nodes
//T.C :- O(N)

class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head == null){
            return 0;
        }
        int leftSum = sumBT(head.left); 
        int rightSum = sumBT(head.right); 
        int totalSum = leftSum + rightSum + head.data;
        return totalSum;
     
    }
}
