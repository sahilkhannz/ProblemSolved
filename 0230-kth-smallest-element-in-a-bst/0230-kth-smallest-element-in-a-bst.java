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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;
        PriorityQueue <Integer>temp=new PriorityQueue<>();
        treeToList(root,temp);
        for(int i=0;i<k-1;i++){
            temp.poll();
        }
        return temp.peek();
    }
    public void treeToList(TreeNode root,PriorityQueue<Integer> temp){
        if(root==null)
            return;
        temp.add(root.val);
        treeToList(root.left,temp);
        treeToList(root.right,temp);
    }
}