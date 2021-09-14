package com.ematrix;

import java.util.Arrays;

public class StringPermutations {

    public boolean isPermutation(String L,String R){
        int l=L.length();
        int r=R.length();
        if(l!=r){
            return false;
        }

        int[] lCSet=new int[256];
        Arrays.fill(lCSet,0);
        int[] rCSet=new int[256];
        Arrays.fill(rCSet,0);

        char[] lChars=L.toCharArray();
        char[] rChars=R.toCharArray();
        for(char c:lChars){
            lCSet[(int)c]++;
        }

        for(char c:rChars){
            rCSet[(int)c]++;
        }
        for(int i=0;i<256;i++){
            if(rCSet[i]!=lCSet[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        StringPermutations  stringPermutations  =new StringPermutations ();
        boolean result=stringPermutations .isPermutation ("ADV","AVD");
        System.out.print("Is string permutation "+result);

    }
}
