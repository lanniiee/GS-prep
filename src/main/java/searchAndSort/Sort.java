package searchAndSort;

import java.util.Arrays;

public class Sort {

    // O(log n)
        // quicksort() - select a value as a pivot. put all values smaller than pivot to left and all values greater than pivot on right - use recursion?
    public static void quickSort(int[] arr) {


    }
        // mergesort() - split in middle and keep splitting until only has 2 element or 2. then sort and merge
    public static void mergesort(int[] arr) {
        int arrLength = arr.length;

        // set condition for the recursion to stop at when arr length is less than 2
        if (arrLength < 2) {
            return;
        }

        int middle = arrLength/2;
        int[] leftSide = new int[middle];
        int[] rightSide = new int[arr.length-middle];

        for(int i = 0; i < leftSide.length; i++) {
            leftSide[i] = arr[i];
        }
        for(int i = leftSide.length; i < arr.length; i++) {
            rightSide[i - leftSide.length] = arr[i];
        }

        mergesort(leftSide);
        mergesort(rightSide);

        merge(arr, leftSide, rightSide);

        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;

        int r = 0, l = 0, i = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
            i++;
        }

        while (r < rightSize) {
            arr[i] = right[r];
            i++;
            r++;
        }

        while (l < leftSize) {
            arr[i] = left[l];
            l++;
            i++;
        }

    }



    // o(n^2)
        // insertion() - take current element and insert it at the appropriate position in the list, adjusting the list each time you insert. 2 counters.
    public static void insertionSort(int[] arr) {

    }
        // selection() - select the smallest number and switch values
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }
        // bubbleSort() - check adjacent numbers and switch values if condition is met
    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp;
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] numbers = {7, 6, 5, 8, 1, 9, -1, 2, 6};

//        System.out.println(Arrays.toString(bubbleSort(numbers)));

//        System.out.println(Arrays.toString(selectionSort(numbers)));;
//        mergesort(numbers);

        mergesort(numbers);

    }

}
