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
    // int count=0;
    // int maxcount=0;
    public int maxDepth(TreeNode root) {
        // if(root==null){
        //     maxcount=Integer.max(count,maxcount);
        //     count-=1;
        //     return 0;
        // }
        // count++;
        // maxDepth(root.left);
        // maxDepth(root.right);
        // return maxcount;
        if(root==null) return 0;
        return 1+Integer.max(maxDepth(root.left),maxDepth(root.right));
    }
}
