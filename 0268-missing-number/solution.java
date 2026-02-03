class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        // for(int i=0; i<n-1;i++){
        //     for(int j=i+1;j<n-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }
        int sum=0;
        while(n>0){
            sum=sum+n;
            n--;
        }
         int sum2=0;

    for(int i=0;i<nums.length;i++){

        sum2=sum2+nums[i];
    }
   
    int result=sum-sum2;
    return result;


        
    }
}
