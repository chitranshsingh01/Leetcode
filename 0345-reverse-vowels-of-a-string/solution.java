class Solution {
     public static String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            char a=arr[start];
            char b=arr[end];
            String vowels="aeiouAEIOU";
            boolean flag=false;
            boolean flag2=false;
            for (int i = 0; i <vowels.length(); i++) {
                char v=vowels.charAt(i);
                
                if(a==v)flag=true;  

                if(b==v) flag2=true;
            }
                if(flag==true&&flag2==true){
                     char temp = arr[start];
                     arr[start] = arr[end];
                     arr[end] = temp;
                        start++;
                        end--; 
                }
                else if(flag==true&&flag2==false){
                    end--;
                }
                else{
                    start++;

                }
            
        }
        String result=new String(arr);
        return result;
    }
}
