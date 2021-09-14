package com.ematrix;

import java.util.Locale;

public class CheckRotation {
    public boolean isRotation(String s1,String s2){
        StringBuilder s3= new StringBuilder();
        if(s1.length()!=s2.length()){
            return false;}
        s3.append(s1).append(s1);

        return s3.toString().toLowerCase().contains(s2.toLowerCase(Locale.ROOT));
    }

    public static void main(String[] args){
        String sOne="Waterbottle";
        String sTwo="erbottlewat";
        CheckRotation checkRotation= new CheckRotation();
        boolean result = checkRotation.isRotation(sOne,sTwo);
        System.out.println(sTwo+" is substring of "+sOne+" "+result);

    }
}
