package org.example;

import java.util.Arrays;

public class MatrixProduct {

    // Given a matrix
    // find the path from top left to bottom right with
    // the greatest product by moving only down and right.

    public static void maxPath(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[] numArr = new int[row+column-1];

        int startNum = grid[0][0];
        int currentNum;

        numArr[0] = startNum;
        int currentR = 0;
        int currentC = 0;
        int index = 1;
        int product = 1;

        while (index < numArr.length) {
            if (currentR != row -1 && currentC != column-1) {
                if (grid[currentR][currentC+1] > grid[currentR+1][currentC]) {
                    numArr[index++] = grid[currentR][currentC+1];
                    currentC++;
                } else {
                    numArr[index++] = grid[currentR+1][currentC];
                    currentR++;
                }
            }
            if (currentC == column-1) {
                numArr[index++] = grid[currentR+1][currentC];
                currentR++;
            } else if (currentR == row -1) {
                numArr[index++] = grid[currentR][currentC+1];
                currentC++;
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            product *= numArr[i];
        }

        System.out.println(product);
    }


    public static void main(String[] args) {

        maxPath(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
