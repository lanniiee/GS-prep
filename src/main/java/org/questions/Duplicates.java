package org.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static Integer[] findDuplicates(int[] arr) {
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && !tempList.contains(arr[i])) {
                tempList.add(arr[i]);
            }
        }

        return tempList.toArray(new Integer[0]);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDuplicates(new int[] {2, 1, 2, 1})));
    }
}
