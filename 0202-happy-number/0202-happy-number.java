class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(true){
             int a=n%10;
                sum+=(a*a);
                n=n/10;
                if(n==0){
                    if(sum==1) return true;
                     if(sum==4) return false;
                n=sum;
                sum=0;
                }
        }
    }
}