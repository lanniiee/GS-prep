package org.example;

public class MedianOfMerge {

   public static int[] merge(int[] arr1, int[] arr2) {
       int[] concatArr = new int[arr1.length+ arr2.length];

       for(int i = 0; i < arr1.length; i++) {
           concatArr[i] = arr1[i];
       }

       for(int i = arr1.length; i < arr1.length + arr2.length; i++) {
           concatArr[i] = arr2[i-arr1.length];
       }

       return concatArr;

   }

   public static int[] sort(int[] arr) {
       // bubble sort
       for (int i = 0; i < arr.length-1; i++) {
           for (int j = 0; j < arr.length-i-1; j++) {
               if (arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }

       return arr;
   }

   public static double median(int[] arr) {
       int arrLength = arr.length;
       int midpoint = arrLength/2;
       double result = arr[midpoint-1];

       if (arrLength % 2 == 0) {
           result = (double) (arr[midpoint-1] + arr[midpoint])/2;
       }

       return result;
   }

    public static void main(String[] args) {
        sort(new int[] {7, 8, 9, 2, 5, 4, 10, 8, 10, 1, 6, 3, 5, 4, 11, 7});
    }

}
