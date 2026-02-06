class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1) return x;
        int r=x;
        int l=0;
        int ans=0;
        while(l<=r){
           int mid=l+(r-l)/2;
           long sq=(long)mid*mid;
            if(sq<=x){
                ans=mid;
                l=mid+1;
            }
            else if(sq>x){
                r=mid-1;
            }
        }
        return ans;
        
    }
}
