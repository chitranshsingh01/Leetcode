/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val==p.val || root.val==q.val) return root;
        boolean ponleft = exist(root.left,p.val);
        boolean qonleft = exist(root.left,q.val);
        if(ponleft && qonleft) return lowestCommonAncestor(root.left,p,q);
        if(!ponleft && !qonleft) return lowestCommonAncestor(root.right,p,q);
        else return root;  
    }
    public boolean exist(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return (exist(root.left,val) || exist(root.right,val));
    }
}