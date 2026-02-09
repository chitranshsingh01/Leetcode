class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] flag=new boolean[n];
        for(int i=0;i<n;i++){
           int a=nums[i]; 
            if(flag[a]==true){
                return nums[i];
            }
            flag[nums[i]]=true;
             


        }
        return -1;
    }
}
