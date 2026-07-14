
class Solution {
    static boolean flag;
    public int helper(TreeNode root){
         if(root==null) return 0;
         int left=helper(root.left);
         int right=helper(root.right);
         if(Math.abs(left-right)>1) flag= false;
         return 1+Math.max(left,right);

    } 
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag=true;
        helper(root);
        return flag;
    }
}