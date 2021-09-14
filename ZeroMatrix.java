package com.ematrix;

import java.util.Arrays;

public class ZeroMatrix {
    public void transForm(int[][] S){
        int n=S.length;
        System.out.print(n);
        boolean[] rows=new boolean[S.length];
        boolean[] columns=new boolean[S[0].length];
        Arrays.fill(rows,false);
        Arrays.fill(columns,false);
        for(int i=0;i<n;i++){
            for(int j=0;j<S[i].length;j++){
                if(S[i][j]==0){
                    rows[i] =true;
                    columns[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<S[i].length;j++){
                if(rows[i]){
                    S[i][j]=0;
                }
                if( columns[j]){
                    S[i][j]=0;
                }
            }
        }

    }


    public static void main(String[] args) {

        int[][] a = {
                {0, 2, 3, 4,5},
                {5, 6, 7, 0,4},
                {9,10,11,12,6},
                {13,7,15,16,7}

        };
        ZeroMatrix zeroMatrix =new ZeroMatrix();
        zeroMatrix.transForm(a);
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
