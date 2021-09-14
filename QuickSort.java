package com.ematrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QuickSort {


    public void quickSort(Queue<Integer> S){
                Integer n=S.size();
                Integer  pivot=S.peek();
                if (n < 2) return;
                Queue<Integer> L=new ConcurrentLinkedQueue<>();
                Queue<Integer> E=new ConcurrentLinkedQueue<>();
                Queue<Integer> G=new ConcurrentLinkedQueue<>();
                while(!S.isEmpty()){
                    int c=S.poll();
                    if(c<pivot){
                        L.add(c);
                    }
                    else if(c==pivot){
                        E.add(c);
                    }else{
                        G.add(c);
                    }
                }
                quickSort(L);
                quickSort(G);
                while (!L.isEmpty( )){
                    S.add(L.poll());
                }
                while (!E.isEmpty( )){
                    S.add(E.poll());
                }
                while (!G.isEmpty( )){
                    S.add(G.poll());
                }

       }
       public static void main(String[] args){
           QuickSort newSort=new QuickSort();
           Queue<Integer> valuesToSot=new ConcurrentLinkedQueue<>(){};
           valuesToSot.add(3);
           valuesToSot.add(7);
           valuesToSot.add(9);
           valuesToSot.add(5);
           valuesToSot.add(2);
           valuesToSot.add(8);
           valuesToSot.add(15);
           newSort.quickSort(valuesToSot);
           System.out.println(valuesToSot);


       }
}
