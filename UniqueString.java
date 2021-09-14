package com.ematrix;

public class UniqueString {

    public boolean hasUniqueChar(String S){
        int n=S.length();
        char[] tempS=S.toCharArray();
        for (int i=0;i<n;i++){
            char c=tempS[i];
            int j=i+1;
            while(j<n){

                if(c==tempS[j]){
                return false;}
                j++;
            }
        }
        return true;
    }

    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

         boolean[] char_set = new boolean[128];
          for (int i= 0; i < str.length(); i++) {
              int val= str.charAt(i);
              System.out.println((int)str.charAt(i));
             if (char_set[val]) {//Already found this char in string
                 return false;
                 }
             char_set[val] = true;
             }
         return true;
         }
    public static void main(String[] args){
        UniqueString uniqueString =new UniqueString();
        boolean result=uniqueString.isUniqueChars("ADAGJWEV");
        System.out.print("Is string unique "+result);

    }
}
