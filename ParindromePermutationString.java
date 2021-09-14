package com.ematrix;

import java.util.Arrays;

public class ParindromePermutationString {
    private boolean isValid(String S) {
        int[] chaSet=new int[256];
        int evenCount=0;
        int oddCount=0;
        int n =S.length();

        Arrays.fill(chaSet,0);
        for(int i=0;i<n;i++){
            if(S.charAt(i)!=' '){
                chaSet[(int)S.charAt(i)]++;

            }
        }

        int odd = 0;
        for (int i = 0; i < 256; i++) {
            System.out.print((chaSet[i] & 1));
            if ((chaSet[i] & 1) == 1)
                odd++;

            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;

    }
    public static void main(String[] args){
        ParindromePermutationString parindromePermutationString =new ParindromePermutationString();
        boolean result =parindromePermutationString.isValid("taco cat");
        System.out.println("This string is a palindrome "+result);
    }


}
