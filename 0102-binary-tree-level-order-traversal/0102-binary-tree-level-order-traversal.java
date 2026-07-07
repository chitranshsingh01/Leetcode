class Solution {
     class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int currlevel=0;
            List<Integer> nums=new ArrayList<>();
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level!=currlevel){
                currlevel++;
                list.add(nums);
                nums=new ArrayList<>();
            }
            nums.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
        }
        list.add(nums);
        return list;
    }
}