class Solution {
       public static boolean hasAlternatingBits(int n) {
         String binary=Integer.toBinaryString(n);
        System.out.println(binary);
        for (int i = 0; i < binary.length()-1; i++) {
            int j=i+1;
            if(binary.charAt(i)==binary.charAt(j)){
                return false;
            }
        }
        return true;  
    }
}
//1011
