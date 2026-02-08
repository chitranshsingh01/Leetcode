class Solution {
    public void sortColors(int[] nums) {

         for (int i = 0; i < nums.length; i++) {
            int minindex=i;
            for (int j = i+1; j < nums.length; j++) {
                
                if(nums[j]<nums[minindex]){
                minindex=j;
                }
            }
               int temp=nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temp; 
           
            }
        
    }
}
