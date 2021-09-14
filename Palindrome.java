package com.ematrix;

import java.util.LinkedList;

public class Palindrome {
   public Palindrome(){

   }

   public static boolean testPalindrome(String newAry,int low,int high){
             if(low>=high){
                 return true;
             }
             if(newAry.charAt(low)!=newAry.charAt(high)){
                 System.out.println(newAry.charAt(low));
                 System.out.println(newAry.charAt(high));

                 return false;
             }
       return testPalindrome(newAry,low+1,high-1);

   }
}
