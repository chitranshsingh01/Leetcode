class Solution {
    int Maximum=0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        int diameter=left+right;
         Maximum =Math.max(Maximum,diameter);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return Maximum;
    }
}
