class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;

        if(root.val>key){ // GO LEFT
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){ // GO RIGHT
            root.right=deleteNode(root.right,key);
        }
        else{ // ROOT.VAL==TARGET
            // CASE 1 - LEAF NODE
            if(root.left==null && root.right==null) return null;
            // CASE 2 - ONLY 1 CHILD
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;
            //CASE 3 - BOTH CHILD
            TreeNode pred=root.left;
            while(pred.right!=null) pred=pred.right;
            root.left=deleteNode(root.left,pred.val);
            pred.right=root.right;
            pred.left=root.left;
            return pred;
        }
        return root;
    }
}

