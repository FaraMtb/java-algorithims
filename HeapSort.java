package com.ematrix;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSort {

    public void heapSort(int[] S){
        PriorityQueue<Integer> temp = new PriorityQueue<>(Comparator.naturalOrder());
        if(0>=S.length) return;
        for(int item:S){
            temp.add(item);
        }
        for(int x=0;x<S.length;x++){
            S[x]= temp.poll();
        }


    }

    public static void main(String[] args){
        HeapSort eapSort =new HeapSort();
        int[]aryToSort={2,5,7,12,8,4,5,15};
        eapSort.heapSort(aryToSort);
        for(int r:aryToSort)
             System.out.print(r+", ");
    }
}
