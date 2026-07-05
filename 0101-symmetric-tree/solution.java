
class Solution {
//     public TreeNode copyTree(TreeNode root) {
//     if (root == null)
//         return null;
//     TreeNode newNode = new TreeNode(root.val);
//     newNode.left = copyTree(root.left);
//     newNode.right = copyTree(root.right);
//     return newNode;
// }
// public TreeNode invertTree(TreeNode root){
//         if (root == null)
//             return null;
//         // Swap left and right
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right = temp;
//         // Mirror left and right subtrees
//         invertTree(root.left);
//         invertTree(root.right);
//         return root;
// }
//  public boolean isSameTree(TreeNode p, TreeNode q) {

//         // Both nodes are null
//         if (p == null && q == null)
//             return true;

//         // One node is null
//         if (p == null || q == null)
//             return false;

//         // Values are different
//         if (p.val != q.val)
//             return false;

//         // Compare left and right subtrees
//         return isSameTree(p.left, q.left) &&
//                isSameTree(p.right, q.right);
//     }
//     public boolean isSymmetric(TreeNode root) {
//     TreeNode copiedRoot = copyTree(root);
//     TreeNode invertedTree=invertTree(root.right);
//     boolean ans= isSameTree( root.left, root.right);
//     return ans;
//  TreeNode copiedRight = copyTree(root.right);
//     invertTree(copiedRight);

//     return isSameTree(root.left, copiedRight);
// }
// public TreeNode copyTree(TreeNode root){
//     if(root==null) return null;
//     TreeNode newNode=new TreeNode(root.val);
//     newNode.left =copyTree(root.left);
//     newNode.right=copyTree(root.right);
//     return newNode;
// }
public TreeNode invertTree(TreeNode root){
    if(root==null) return null;
    TreeNode temp=root.left;
    root.left=root.right;
    root.right=temp;
    invertTree(root.left);
    invertTree(root.right);
    return root;
}

public boolean isSameTree(TreeNode p,TreeNode q){
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    if(p.val!=q.val) return false;
    return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
}

public boolean isSymmetric(TreeNode root){
    TreeNode invertedTree=invertTree(root.right);
    return isSameTree(root.left,root.right);
}
}
