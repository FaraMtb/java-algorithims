package com.ematrix;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    /* Java program for Merge Sort */

    public void merge(int[] sOne,int[] sTwo,int[]S){
        int i=0;
        int j=0;
        while(i+j<S.length){
            if(j==sTwo.length||(i<sOne.length&&(sOne[i]<sTwo[j]))){
                S[j+i]=sOne[i++];
            }else{
                S[j+i]=sTwo[j++];
            }
        }

    }
    public void sort(int[] S){
        if(S.length<2){
            return;
        }
        int mid= S.length/2;
        int[] sOne=Arrays.copyOfRange(S,0,mid);
        int[] sTwo=Arrays.copyOfRange(S,mid,S.length);
        sort(sOne);
        sort(sTwo);
        merge(sOne,sTwo,S);
    }
    public static void main(String[] args){
        int[] ary=new int[10000000];
        Random rand =new Random();
        rand.setSeed(927838837377388388L);
        for(int x=0;x<10000000;x++)
            ary[x]=rand.nextInt(10000000);
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort(ary);
        for(int item:ary)
           System.out.print(item+",");
    }
}