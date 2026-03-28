class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double MaxAvg=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        MaxAvg=sum/k;
        int n=0;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[n];
            MaxAvg=Math.max(MaxAvg,sum/k);
            n++;
        }
        return MaxAvg;
        
    }
}
