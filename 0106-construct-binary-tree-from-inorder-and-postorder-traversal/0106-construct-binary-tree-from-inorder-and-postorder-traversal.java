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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)
            return null;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hmap.put(inorder[i],i);
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hmap);
    }
    public TreeNode helper(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,Map<Integer,Integer> hmap){
        if(is>ie || ps>pe)
            return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int rootindex=hmap.get(root.val);
        int numleft=rootindex-is;
        //lst only have postorder remaining number as size of inorder of lst
        TreeNode lst=helper(inorder,is,rootindex-1,postorder,ps,ps+numleft-1,hmap);
        
        TreeNode rst=helper(inorder,rootindex+1,ie,postorder,ps+numleft,pe-1,hmap);
        
        root.left=lst;
        root.right=rst;
        return root;
    }

    
    }