package org.questions;

import java.util.Arrays;

public class MergeAndSort {

    public static void mergeAndSort(int[][] sortedArr) {
        int[] singleArr = new int[sortedArr[0].length*sortedArr.length];

        int k = 0;

        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = 0; j < sortedArr[i].length; j++) {
                singleArr[k] = sortedArr[i][j];
                k++;
            }
        }

        mergeSort(singleArr);
        System.out.println(Arrays.toString(singleArr));
    }

    public static void mergeSort(int[] arr) {
        int arrLength = arr.length;

        if (arrLength < 2) {
            return;
        }

        int middleIndex = arrLength/2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[arrLength-middleIndex];

        for(int i = 0; i < leftSide.length; i++) {
            leftSide[i] = arr[i];
        }
        for(int i = middleIndex; i < arrLength; i++) {
            rightSide[i-middleIndex] = arr[i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);

        merge(arr, leftSide, rightSide);

    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int l = 0, r = 0, i = 0;

        while(l < leftSize && r < rightSize) {
            if(left[l] <= right[r]) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
            i++;
        }

        while(l < leftSize) {
            arr[i] = left[l];
            l++;
            i++;
        }
        while(r < rightSize) {
            arr[i] = right[r];
            r++;
            i++;
        }

    }


    public static void main(String[] args) {
        mergeAndSort(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
    }
}
