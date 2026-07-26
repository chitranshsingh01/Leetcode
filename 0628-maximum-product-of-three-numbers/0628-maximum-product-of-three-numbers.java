class Solution {
 public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int largest=nums[n];
        int seclargest=nums[n-1];
        int thirdlargest=nums[n-2];
        int smallest=nums[0];
        int secsmallest=nums[1];

        int max=largest*seclargest*thirdlargest;
        int secmax=smallest*secsmallest*largest;

        return Math.max(max,secmax);
       
    }
}
