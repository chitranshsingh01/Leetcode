class Solution {
    public static int missingInteger(int[] nums) {

        int sum=nums[0];
        int i;
        for ( i = 1; i < nums.length; i++) {
        if(nums[i]==nums[i-1]+1){
            sum+=nums[i];
          }
        else{
            break;
          }
        }
        for (int k = 0; k < nums.length; k++) {
            for (int j = i-1; j < nums.length; j++) {
                if(sum==nums[j]){
                    //statement
                      sum++;
                      k=0;
                    break;  
                }
                else if(sum!=nums[j] && j==nums.length-1){
                     return sum;
                  
                }
            }
        }
        return sum;
    }
}
