import java.util.Scanner;
class Solution { 

    static  boolean isPalindrome(int x) {
    int b=x;
    int sum =0;
     while (x>0) {
    int rem= x%10;
    sum = sum*10+rem;
    x/=10;
   }
if (sum==b) {
    return true;
}
else{
    return false;
}
        
    }
     public static void main(String[] args) {
    System.out.println("Enter the number to check palindrome");
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    boolean a = isPalindrome(num);
    System.out.println(a);
    
    
}
}
