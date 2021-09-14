package com.ematrix;

public class RotateMatrixMM {

    public void rotateMatrix(int[][] a) {

        int m=0;
        for(int i=0; i<a.length; ++i){
            for(int j=m; j<a[0].length; ++j) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
            m++;
        }

        for(int i=0; i<a.length; ++i) {
            int end = a.length-1;
            for(int j=0; j<a[0].length; j++) {
                if(j>=end)
                    break;
                int tmp = a[i][j];
                a[i][j] = a[i][end];
                a[i][end] = tmp;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 4,5},
                {5, 6, 7, 8,4},
                {9,10,11,12,6},
                {13,14,15,16,7},
                {13,14,15,16,7}

        };
        RotateMatrixMM rotateMatrixMM =new RotateMatrixMM();
        rotateMatrixMM.rotateMatrix(a);
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
