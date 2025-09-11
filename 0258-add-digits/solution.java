class Solution {
    public int addDigits(int num) {
   int a=0;
       int sum =0;
       int add=0;
       while (num>9) {
        add=num;
        num=0;
       while(add>0){
            a = add%10;
            num+=a;
            add=add/10;
       }

        
       }
    return num;
        
    }
}
