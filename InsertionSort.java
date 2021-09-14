package com.ematrix;

import java.util.Collections;

public class InsertionSort<T extends Comparable> {

    private T[] sortableList;
    public InsertionSort(T[] newSortableList){
        sortableList=newSortableList;
    }
    public String getSortedArray(){
         int n=sortableList.length;
         int j=0;
         if(sortableList.length<=0){
             return "no data";
         }
                 //outer iteration of n
        for (int i=1;i<n;i++){
            j=i;
            T compareValue = sortableList[j];
            //inner swaping of each value from end to start
            while(j>0 && compareValue.compareTo(sortableList[j-1])<0){
                sortableList[j]=sortableList[j-1];
                sortableList[j-1]=compareValue;
                j--;

            }
        }
        return this.toString();

    }
    @Override
    public String toString(){
        StringBuilder tempString=new StringBuilder();
        for (T iterm:sortableList
             ) {
            tempString.append(iterm).append(",");
        }
        return tempString.toString();
    }


}
