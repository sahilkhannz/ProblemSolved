/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        
        return helper(root,targetSum,sum);
            
    }
    public boolean helper(TreeNode root,int t,int sum){
        if(root==null)
            return false;
        sum+=root.val;
        boolean leftsum=false,rightsum=false;
        if(root.left==null && root.right==null)
            if(t==sum)
                return true;
        if(root.left!=null)
           leftsum= helper(root.left,t,sum);
        if(root.right!=null)
           rightsum= helper(root.right,t,sum);
       
        return leftsum || rightsum;
        
    }
}