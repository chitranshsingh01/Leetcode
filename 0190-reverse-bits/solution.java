class Solution {
    public static int reverseBits(int n) {
        if (n==0) {
            return 0;
        }
       String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] character=binary.toCharArray();
        int i=0; 
        int j=character.length-1;
        while(i<=j){
            char temp=character[i];
            character[i]=character[j];
            character[j]=temp;
            i++;
            j--;
        }
        String ans=new String(character);
        int ans2=Integer.parseInt(ans,2);
        return ans2;   
    }
}
