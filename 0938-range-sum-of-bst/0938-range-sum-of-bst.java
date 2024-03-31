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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return -1;
        Queue <TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- != 0){
                TreeNode curr=q.poll();
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
                if(low<=curr.val && high>=curr.val)
                    ans+=curr.val;
            }
        }
        return ans;
    }
}