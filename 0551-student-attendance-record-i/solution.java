class Solution {
     public static boolean checkRecord(String s) {
        if(s.length()==0) return true;
        char A='A';
        char L='L';
        int a=0;
        String leave="LLL";
        for (int i = 0; i <s.length(); i++) {
            if(A==s.charAt(i)){
                a++;
            }
            if(L==s.charAt(i) && i+2 <=s.length()-1){
                if(leave.equals(s.substring(i,i+3))){
                    
                    return false;
                }
            }  
        }
        if(a>=2){
            return false;
        }
        return true; 
    }
}
