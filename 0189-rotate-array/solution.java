class Solution {
    public void rotate(int[] nums, int k) {
       
         int n=nums.length;
         k=k%n;
        int o=n-k;


          reverse(nums,0,o-1);
          reverse(nums,o,n-1);
          reverse(nums,0,n-1);
        // for (int i : result) {
        //     System.out.print(i+" ");
            
        // }
        
    }
       static int[] reverse(int[] arr , int start,int end){
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
