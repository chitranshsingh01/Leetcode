class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int[] ans=new int[nums.length-k+1];
        Deque<Integer> q= new ArrayDeque<>();
        Queue<Integer> a=new LinkedList<>();
        for (int i = 0; i <k; i++) {

             while(!q.isEmpty() && nums[q.peekLast()] <=nums[i] ) {
                q.removeLast();
            }
            q.addLast(i);   
        }
        // ans[0]=nums[q.peekFirst()];
        for (int i = k; i <nums.length; i++) {
            a.add(nums[q.peekFirst()]);
            while(q.size()>0 && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(q.size()>0 && nums[q.peekLast()]<=nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            // ans[i-k+1]=nums[q.peekFirst()]; 
        }
        if(q.size()>0){

            a.add(nums[q.peekFirst()]);
        }
        int i=0;
        while(a.size()>0){
            ans[i++]=a.remove();
        }
        return ans;
    }
}
