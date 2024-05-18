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
    int moves=0;
    public int dfs(TreeNode root){
        if(root==null)
            return 0;
        int leftextra=dfs(root.left);
        int rightextra=dfs(root.right);
        moves+=Math.abs(leftextra)+Math.abs(rightextra);
        return root.val+leftextra+rightextra-1;
    }
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
}