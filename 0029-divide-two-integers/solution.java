class Solution {
   static int divide(int dividend,int divisor){
         double a=dividend;
           double b=divisor;
       double c=dividend/divisor;
       if(dividend==-2147483648&&divisor==-1){
        return (int)((c+1)*-1);
       }    
    return (int)c;
       
    }
}
