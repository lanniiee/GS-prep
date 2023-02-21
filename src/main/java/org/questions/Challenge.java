package org.questions;

import java.util.Arrays;

public class Challenge {

//    You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
//    Write a method getProductsOfAllIntsExceptAtIndex that takes an array of integers and returns an array of the products.
//    For example, given:
//            [1, 7, 3, 4]
//    your method would return:
//            [84, 12, 28, 21]
//    by calculating:
//            [7 * 3 * 4, 1 * 3 * 4, 1 * 7 * 4, 1 * 7 * 3]
//    Here’s the catch: You can’t use division in your solution!

    public static int[] getProductsOfAllIntsExceptAtIndex (int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            int currentIndex = i;
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != arr[currentIndex]) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        getProductsOfAllIntsExceptAtIndex(new int[] {1, 7, 3, 4});
    }
}
