import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of element ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int ans= findNumbers(arr);
        System.out.println("the num of element with even digits are:" + ans);

    }
    public static int findNumbers(int[] nums){
          int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) { 
                count++;
            }
        }
        return count;
    }
    static boolean even(int a){
        int b=0;
        while (a>0){
            a=a/10;
            b=b+1;
        }
        if (b%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
}


