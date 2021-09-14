package com.ematrix;

public class StringCompressionNumber {

    public String toCompress(String s1){
        StringBuilder sb =new StringBuilder();
        int count =1;
        char prev = s1.charAt(0);
        for(int i=1;i<s1.length();i++){
            char curr =s1.charAt(i);
            if(prev==curr){
                count++;
            }else{
                sb.append(prev);
                sb.append(count);
                prev = curr;
                count=1;
            }
        }
        sb.append(prev);
        sb.append(count);
        if(s1.length()<sb.length()){
            return s1;
        }else{
            return sb.toString();
        }
    }
    public static void main(String[] args){
          String toComp ="aabcccccaaa";

        StringCompressionNumber stringCompressionNumber=new StringCompressionNumber();
        String result=stringCompressionNumber.toCompress(toComp);
        System.out.println("The compress result is "+result);
    }
}
