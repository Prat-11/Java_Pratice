package com.Pratham_Maini.Day42;

public class LargestInRow {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 21, 14},
                {5, 6, 8},
                {9, 10, 11}
        };

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Row " + (i+1) + " largest: " + max);
        }
    }

}

