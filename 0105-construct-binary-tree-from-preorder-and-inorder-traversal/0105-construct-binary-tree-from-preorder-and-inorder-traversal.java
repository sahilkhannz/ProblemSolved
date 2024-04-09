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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length)
            return null;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hmap.put(inorder[i],i);
        return helper(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hmap);        
    }
    public TreeNode helper(int[] inorder,int is,int ie,int[] preorder,int ps,int pe,Map<Integer,Integer>hmap){
        if(is>ie || ps>pe)
            return null;
        TreeNode root=new TreeNode(preorder[ps]);
        int rootindex=hmap.get(root.val);
        int numsleft=rootindex-is;
        
        TreeNode lst=helper(inorder,is,rootindex-1,preorder,ps+1,ps+numsleft,hmap);
        TreeNode rst=helper(inorder,rootindex+1,ie,preorder,ps+numsleft+1,pe,hmap);
        root.left=lst;
        root.right=rst;
        
        return root;
    }
}