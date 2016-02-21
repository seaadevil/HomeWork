package com.bugs.null_pointer_exceptions;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i]= new int [i+1];
            /*matrix[0] = new int[1];
            matrix[1] = new int[2];
            matrix[2] = new int[3];
            matrix[3] = new int[4];
            matrix[4] = new int[5];*/
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

            //implements yours output according to the next style
           /* for (int[] matrix_ : matrix) {
                System.out.println(Arrays.toString(matrix_));
            }*/

        }
    }
}
/*
[1]
[1, 1]
[1, 1, 1]
[1, 1, 1, 1]
[1, 1, 1, 1, 1]
 */